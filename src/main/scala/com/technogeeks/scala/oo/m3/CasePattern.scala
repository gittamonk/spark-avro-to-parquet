package com.technogeeks.scala.oo.m3

object CasePattern extends App{
  println("Step 1: Pattern matching 101 - a very basic example")
  
    val bookType = "Paperback"

  bookType match {
    case "Paperback" => println("GOOD")
    case "PlainBook"  => println("BAD")
  }

 

  println("\nStep 2: Pattern matching and return the result")
  val book = bookType match {
    case "Paperback" => "GOOD"
    case "PlainBook"  => "BAD"
  }
  println(s"Book level of $bookType = $book")

// Wild Card operator needs to be used in the case of the default operations
val bookType1 = "test"
  println("\nStep 3: Pattern matching using the wildcard operator")
  val bookLevel2 = bookType1 match {
    case "Paperback" => "GOOD"
    case "PlainBook"  => "BAD"
    case _              => "NEUTRAL"
  }
  println(s"Book level of $bookType = $bookLevel2")



  println("\nStep 4: Pattern matching with two or more items on the same condition")
  val bookLevel3 = bookType match {
    case "Paperback" | "PlainBook" => "GOOD"
    case "PlainNewBook" => "BAD"
    case _  => "NEUTRAL"
  }
  println(s"Book level of $bookType = $bookLevel3")



  println("\nStep 5; Pattern matching and using if expressions in the case clause")
  val bookLevel4 = bookType match {
    case book if (book.contains("Paperback") || book.contains("PlainBook")) => "GOOD"
    case "PlainNewBook"  => "BAD"
    case _  => "NEUTRAL"
  }
  println(s"Book level of $bookType = $bookLevel4")

//Any is at the root of Scala's type hierarchy

  println("\nStep 6: Pattern matching by types")
  val priceOfBook: Any = "Test"
  val priceType = priceOfBook match {
    case price: Int     => "Int"
    case price: Double  => "Double"
    case price: Float   => "Float"
    case price: String  => "String"
    case price: Boolean => "Boolean"
    case price: Char    => "Char"
    case price: Long    => "Long"
  }
  println(s"Book price type = $priceType")
}