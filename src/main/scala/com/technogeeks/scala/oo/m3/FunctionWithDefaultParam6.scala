package com.technogeeks.scala.oo.m3

object FunctionWithDefaultParam6 extends App{

  def addValues(a: Int = 4, b: Int = 2): Int = {
    var sum: Int = 0
    sum = a + b

     sum
  }

  println("Returned Value : " + addValues());
  println("Returned Value : " + addValues(6));
  println("Returned Value : " + addValues(6, 3));
  println("Returned Value : " + addValues(b = 3));
}