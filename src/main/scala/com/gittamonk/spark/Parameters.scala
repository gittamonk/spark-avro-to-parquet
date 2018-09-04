package com.gittamonk.spark
import scopt.OptionParser

import scala.util.{Failure, Success, Try}
case class Parameters(avroDataPath:String ="",
                      avroHiveDb:String = "",
                      avroHiveTable:String = "",
                      parquetDataPath:String ="",
                      parquetHiveDb:String = "",
                      parquetHiveTable:String = "",
                      partitions:Map[String,String]= Map.empty,
                      incremental: Option[String] = None)

object Parameters {
  def parse(args:Array[String]) :Try[Parameters] = {
    new OptionParser[Parameters]("spark-avro-to-parquet") {

      opt[String]("avroDataPath")
        .required()
        .valueName("avroDataPath")
        .action((x, c) => c.copy(x))
        .text("Input avro data location")

      opt[String]("avroHiveDb")
        .required()
        .valueName("avroHiveDb")
        .action((x, c) => c.copy(x))
        .text("avroHiveDb")

      opt[String]("avroHiveTable")
        .required()
        .valueName("avroHiveTable")
        .action((x, c) => c.copy(x))
        .text("avroHiveTable")

      opt[String]("parquetDataPath")
        .required()
        .valueName("parquetDataPath")
        .action((x, c) => c.copy(x))
        .text("Input parquetDataPath data location")

      opt[String]("parquetHiveDb")
        .required()
        .valueName("parquetHiveDb")
        .action((x, c) => c.copy(x))
        .text("Input parquetHiveDb data location")

      opt[String]("parquetHiveTable")
        .required()
        .valueName("parquetHiveTable")
        .action((x, c) => c.copy(x))
        .text("parquetHiveTable")

      opt[Map[String,String]]("partitions")
        .required()
        .valueName("<partitions>")
        .action((x, c) => c.copy(partitions = x))
        .text("partitions")

      opt[String]("incremental")
        .required()
        .valueName("<incremental>")
        .action((x, c) => c.copy(incremental = Some(x) ))
        .text("specified partition date")


    }.parse(args,Parameters()) match  {
      case Some(x) => Success(x)
      case None => Failure(new IllegalArgumentException("Error parsing arguments: " + args.mkString("[",", ","]")))
    }
  }
} //object
