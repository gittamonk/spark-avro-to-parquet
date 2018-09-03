package com.technogeeks.scala.oo.m3

object FunctionBasics1 extends App{
   println("Step 1: How to define and use a function which has a return type")
  def favoriteBook():String = {
    "Programming Scala"
  }

  val myFavoriteBook = favoriteBook()
  println(s"My favorite donut is $myFavoriteBook")



  println("\nStep 2: How to define and use a function with no parenthesis")
  def leastFavoriteBook = "Magazines"
  println(s"My least favorite book is $leastFavoriteBook")



  /* 
   NOTE:
 		If you have used other mainstream languages such as Java or .NET,
 		Unit is similar to using the void keyword in a method.
   */
  println("\nStep 3: How to define and use a function with no return type")
  def printBookSalesReport(): Unit = {
    // lookup sales data in database and create some report
    println("Printing book sales report... done!")
  }
  printBookSalesReport()
  
  

  
  /*
    NOTE:
		Notice that we did not include the parenthesis () when calling the function printReport.
  This feature becomes more useful and concise as you get to do
   function chaining which we will see in upcoming tutorials.
   */

  println("\nStep 4: Use type inference to define function with no return type")
  def printReport() {
    // lookup sales data in database and create some report
    println("Printing book report... done!")
  }
  val classF = printReport.getClass()
}