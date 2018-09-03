package com.technogeeks.scala.oo.m3

object FunctionBasics2 extends App{
  
  println("Total Value : " + addInt(4, 5));

  def addInt(a: Int, b: Double) = {
    var mysum = 0.0
    mysum = a + b

    mysum
  }
  
 

  //println("Calling no return function" + addIntNoReturn(12, 8));


  //This is also called as procedure
  //preceding "=" symbol missing
  def addIntNoReturn(a: Int, b: Int)= {
    var mysum: Int = 0
    mysum = a + b
    println("Total Value println inside function :" + mysum)

  }
}