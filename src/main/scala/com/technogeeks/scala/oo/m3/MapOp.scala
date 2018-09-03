package com.technogeeks.scala.oo.m3

object MapOp {
   
  import scala.collection.mutable.Map
  println("\nStep 1: How to initialize a Map with 3 elements")
  val map1: Map[String, String] = Map(("PD","Pig Developer"),("SD","Scala Developer"),("HD","Hive Developer"))
  println(s"Elements of map1 = $map1")


  println("\nStep 2: How to initialize a Map using key -> value notation")
  val map2: Map[String, String] = Map("SM"-> "Spark Mlib", "SS" -> "Spark Streaming")
  println(s"Elements of map2 = $map2")


  println("\nStep 3: How to access elements of Map by specific key")
  println(s"Element by key SM = ${map2("SM")}")
  println(s"Element by key SS = ${map2("SS")}")


  println("\nStep 4: How to add elements to Map using +=")
  map1 += ("SR" -> "Spark R")
  println(s"Element in map1 = $map1")



  println("\nStep 5: How to add elements from a Map to an existing Map using ++=")
  map1 ++= map2
  println(s"Elements in map1 = $map1")


  println("\nStep 6: How to remove key and its value from Map using -=")
  map1 -= "HD"
  println(s"Map without the key HD and its value = $map1")


  println("\nStep 7: How to initialize an empty Map")
  val emptyMap: Map[String,String] = Map.empty[String,String]
  println(s"Empty Map = $emptyMap")
}