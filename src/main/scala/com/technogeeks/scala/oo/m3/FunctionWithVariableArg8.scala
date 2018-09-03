package com.technogeeks.scala.oo.m3

object FunctionWithVariableArg8 extends App{
  def printAll(ss: String*) {
    ss.foreach(println)
  }

  printAll()
  printAll("a")
  printAll("a", "b")
    printAll("a", "b","c")

  

  //Use _* to adapt a sequence

  // a sequence of strings
  val books = List("scala", "spark", "hadoop")
  //val subject = List(('a',1),('b',2),('c',3))

  // pass the sequence to the varargs field
  printAll(books:_*)

  //When declaring that a method has a field that can contain a variable number of arguments, 
  //the varargs field must be the last field in the method signature. 
  /*
   * // version 1
def printAll(numbers: Int*) {
    numbers.foreach(println)
}

// version 2
def printAll(numbers: Int*) {
    for (i <- numbers) println
}
   */

}