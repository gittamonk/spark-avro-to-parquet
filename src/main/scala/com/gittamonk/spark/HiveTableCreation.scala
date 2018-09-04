package com.gittamonk.spark

import com.typesafe.scalalogging.LazyLogging
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.catalyst.TableIdentifier
import org.apache.spark.sql.types.{StructType,StructField,StringType}


import scala.util.Try

case class HiveTableCreation( sparkSession: SparkSession) extends LazyLogging {

  import HiveTableCreation._

  def processHiveTableCreation(conf:Parameters, schema : Option[StructType]):Try[Unit] = {
    for {
      _ <- dropTable(conf)
      _ <- createTableBasedOnAvro(conf,schema)
     // _ <- repairTable(conf)
    } yield()
  }

  private[spark] def dropTable(conf: Parameters) : Try[Unit] = Try {
    logger.info(s"Dropping Table ${conf.parquetHiveDb}.${conf.parquetHiveTable}")

    val table = TableIdentifier(conf.parquetHiveTable,Some(conf.parquetHiveDb))
    sparkSession.sessionState.catalog.dropTable(table,ignoreIfNotExists = true, purge = false)

  }

  private[spark] def createTableBasedOnAvro(conf:Parameters, partitionSchema: Option[StructType]): Try[Unit] = Try {

    logger.info(s"Creating Hive table ${conf.parquetHiveDb}.${conf.parquetHiveTable}")

    val catalog = sparkSession.sessionState.catalog

    val soureTable = TableIdentifier(conf.avroHiveTable, Some(conf.avroHiveDb))

    val targetTable = TableIdentifier(conf.parquetHiveTable, Some(conf.parquetHiveDb))

    val sourceTableDesc = catalog.getTempViewOrPermanentTableMetadata(soureTable)

    val soureSchema = sourceTableDesc.schema

    val targetSchema = Try(Option(catalog.getTempViewOrPermanentTableMetadata(targetTable).schema)).getOrElse(None)

    val partitions = sourceTableDesc.partitionColumnNames.map(StructField(_, StringType))

  }

  }

