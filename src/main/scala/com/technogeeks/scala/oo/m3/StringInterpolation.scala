package com.technogeeks.scala.oo.m3

object StringInterpolation extends App{
  
  println("Step 1: Using String interpolation to print a variable")
  val favoriteBook: String = "Learning Scala" 
  val test = "TEST"
  
  println(s"My favorite book = ${favoriteBook} $test")
  println("My book is "+test)
  
  println("\nStep 2: Using String interpolation on object properties")
  case class Technogeeks(name:Any, subject: Any)

  val favoriteInsti: Technogeeks = Technogeeks("tech", "Scala")
  println(s"My favorite book name = favoriteInsti.name, subjectFav = ${favoriteInsti.subject}")
  
   println("\nStep 3: Using String interpolation for formatting text")
  val bookName: String = "Learning Scala"
  val bookRating: String = "Good"
  println(f"$bookName%20s $bookRating")



  println("\nStep 4: Using f interpolation to format numbers")
  val bookPrice: Double = 2.50001
  println(s"Donut price = $bookPrice")
  println(f"Formatted book price = $bookPrice%.4f")
  
   println("\nStep 5: Using raw interpolation")
  println(raw"Favorite book \t ${bookName}" )
  
  
    println("\nStep 6: No raw interpolation")
  println(s"Favorite book \t ${bookName}" )
  
}