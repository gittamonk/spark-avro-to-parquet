package com.technogeeks.scala.oo.m3

object FunctionCallByValue extends App {
  def time(): Long = {
    println("In time()")
    System.nanoTime
  }

  def something() = {
    println("calling something")
    1 // return value
  }

  def exec(t: Long): Long = {
    println("Entered exec, calling t ...")
    println("t = " + t)
    println("Calling t again ...")
    t
  }
  def callByValue(x: Int) = {
    println("x1=" + x)
    println("x2=" + x)
  }

  println(exec(time()))
  println("***********")
  println(callByValue(something()))
}

//NOTE :
//call-by-value functions compute the passed-in expression's value before 
//calling the function, thus the same value is accessed every time.