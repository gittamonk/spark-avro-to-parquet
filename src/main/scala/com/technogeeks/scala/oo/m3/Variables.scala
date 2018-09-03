package com.technogeeks.scala.oo.m3

object Variables extends App {
    
  lazy val lazyVal = {
    println("initialization has been started for lazy val")
    "the lazy object has been created"
  }
  
  val normalVal = {
    println("initialization has been started for normal val")
    "the normal object has been created"
  }
  
  println(lazyVal)
  println(normalVal)
  
}