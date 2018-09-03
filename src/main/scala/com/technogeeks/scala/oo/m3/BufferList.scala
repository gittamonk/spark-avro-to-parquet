package com.technogeeks.scala.oo.m3

object BufferList extends App{
  import scala.collection.mutable.ListBuffer
  println("Step 1: How to initialize a ListBuffer with 3 elements")
  val listBuffer1: ListBuffer[String] = ListBuffer("Hadoop","Spark","Scala")
  println(s"Elements of listBuffer1 = $listBuffer1")



  println("\nStep 2: How to access elements at specific index in a ListBuffer")
  println(s"Element at index 0 = ${listBuffer1(0)}")
  println(s"Element at index 1 = ${listBuffer1(1)}")
  println(s"Element at index 2 = ${listBuffer1(2)}")



  println("\nStep 3: How to add elements to a ListBuffer using +=")
  listBuffer1 += "Spark1.1"
  println(s"Elements of listBuffer1 = $listBuffer1")



  println("\nStep 4: How to add elements from a List to a ListBuffer using ++=")
  listBuffer1 ++= List[String]("Spark 1.2", "Spark 1.3")
  println(s"Elements of listBuffer1 = $listBuffer1")



  println("\nStep 5: How to remove elements from a ListBuffer")
  listBuffer1 -= "Hadoop"
  println(s"Elements of listBuffer1 = $listBuffer1")



  println("\nStep 6: How to remove elements from a List to a ListBuffer using --=")
  listBuffer1 --= List[String]("Spark 1.2", "Spark 1.3")
  println(s"Elements of listBuffer1 = $listBuffer1")



  println("\nStep 7: How to initialize an empty ListBuffer")
  val emptyListBuffer: ListBuffer[String] = ListBuffer.empty[String]
  println(s"Empty list buffer = $emptyListBuffer")
}