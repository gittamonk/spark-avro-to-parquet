package com.technogeeks.scala.oo.m3

class Person {
  var size = 1 // will genereate two functions size and size_
  
override def toString():String = {
  "The Size is New Size" +size
    }
   

}

object ClassBasic extends App {
  var f = new Person()
  println(f)
  //f.size = 5 // It calls f.size_=(5)     //setter. = is the differentiator
  //f.size_=(10) // It calls f.size_=(10)  //setter
  //f.size_=(8)   
  //f.size = (8) //setter method
  
  
  //size  getter
  //size_ setter
  f.size_=(8)

  println("Result of f.size " + f.size) // It calls f.size()  //getter
  println("Result of f.size " + f) 

}