package com.technogeeks.scala.oo.m3

object FunctionWithNamedArg7 {
  def main(args: Array[String]) {
    // a basic method call
    printName("Sampat", "Kumar")

    // using named function parameters
    printName(firstName="Sampat", lastName="Kumar")
    printName(lastName="Sampat", firstName="Kuamar")  
    // you can change the order

    // relying on default function arguments
    printName("Sampat")
    printName()
  }
  
  def printName(firstName:String = "Unknown", lastName:String = "Unknown") {
    System.out.format("Your name is %s %s\n", firstName, lastName)
  }
}