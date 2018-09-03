package com.technogeeks.scala.oo.m3

object StringConcatRegex extends App {
  val msg1 = "Good" //String should be enclosed with double cotes
  val msg2 = "Morning"
  val message = msg1 + msg2
  val concatMsg1Msg2 = s"$msg1 $msg2"

  println(s"Concatinating A String $msg1 and $msg2 = $message")
  println("The concatenated String using Interpolation:" + concatMsg1Msg2)
  println(s"Print $message 5 times = ${message * 5}")
  println(s"Print the length of -> $message = ${message.length()}")
  printf("A string %s,an integer %d,a float %f", "Scala@Technogeeks", 10, 12.2345)
  println()
  printf("Float value upto 2 decimals %1.2f", 12.2345)
  println()
  printf("Float value upto 2 decimals %1.2f", 12.2355)
  
  println("=========================================")
  println("STRING OPERATIONS")
  println("=========================================")
  
  val sampleString = "Learning Scala For Spark"
  println("Printing the First Character" +sampleString.charAt(0))
  println("Printing the Index for S" +sampleString.indexOf('S'))
  println("Using Slice ->" +sampleString.slice(0, 8))
  
  println("=========================================")
  println("PATTERN MATCHING")
  println("=========================================")
  val patternString = "Scala1 Scala2 Scala3"
  println("Check Pattern Matches or Not -> "+patternString.matches("Scala1 Scala2 Scala3"))
  println("Check Second Pattern Matches or Not -> "+patternString.matches("Scala1"))
  println("Check Contains -> "+patternString.contains("Scala1"))
  println("Check Contains -> "+patternString.contains("Scala5"))



  
}