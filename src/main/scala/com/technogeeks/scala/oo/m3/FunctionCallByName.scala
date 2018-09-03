package com.technogeeks.scala.oo.m3

object FunctionCallByName {
  def time() = {
    println("Entered time() ...")
    System.nanoTime
  }

  def something() = {
    println("calling something")
    1 // return value
  }
  // uses a by-name parameter here
  def exec(t: => Long) = {
    println("Entered exec, calling t ...")
    println("t = " + t)
    println("Calling t again ...")
    t
  }

  def callByName(x: => Int) = {
    println("x1=" + x)
    println("x2=" + x)
  }

  println(exec(time()))
  println("***********")
  println(callByName(something()))

}

//NOTE:
//call-by-name functions recompute the passed-in expression's 
//value every time it is accessed.