package com.technogeeks.scala.oo.m3

object BufferArray extends App{
  
  import scala.collection.mutable.ArrayBuffer

  println("Step 1: How to initialize an ArrayBuffer with 3 elements")
  val arrayBuffer1: ArrayBuffer[String] = ArrayBuffer("Scala","Hadoop","BigData")
  println(s"Elements of arrayBuffer1 = $arrayBuffer1")



  println("\nStep 2: How to access elements of an ArrayBuffer at specific index")
  println(s"Element at index 0 = ${arrayBuffer1(0)}")
  println(s"Element at index 1 = ${arrayBuffer1(1)}")
  println(s"Element at index 2 = ${arrayBuffer1(2)}")



  println("\nStep 3: How to add elements to an ArrayBuffer using +=")
  arrayBuffer1 += "Scala Mlib"
  println(s"Elements of arrayBuffer1 = $arrayBuffer1")
  // NOTE: arrayBuffer1 is mutable and hence we were able to add a new element to it



  println("\nStep 4: How to add elements from a List to an ArrayBuffer using ++=")
  arrayBuffer1 ++= List[String]("Scala Streaming", "Scala SQL")
  println(s"Elements of arrayBuffer1 = $arrayBuffer1")



  println("\nStep 5: How to remove elements from an ArrayBuffer")
  arrayBuffer1 -= "Scala" //a = a+ 1, a++ , a += 1
  println(s"Elements of arrayBuffer1 = $arrayBuffer1")



  println("\nStep 6: How to remove elements of a List from ArrayBuffer using --=")
  arrayBuffer1 --= List[String]("Scala Streaming", "Scala SQL")
  println(s"Elements of arrayBuffer1 = $arrayBuffer1")
}