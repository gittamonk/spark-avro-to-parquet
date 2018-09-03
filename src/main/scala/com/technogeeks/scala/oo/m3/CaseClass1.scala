package com.technogeeks.scala.oo.m3

object CaseClass1 extends App {
   println("Step 1: How to define a case class to represent a Book object")
  case class Book(name: String, price: Double, productCode: Option[Long] = None)

  
  /*
   * NOTE:
You did not have to use the new keyword when creating instances of the Book case class.
The case class will automatically create the Companion Object.
   */
  println("\nStep 2: How to create instances or objects for the Book case class")
  val sparkBook: Book = Book("Learning Spark", 1.50)
  val scalaBook: Book = Book("Learnign Scala", 2.0)
  println(s"Spark Book = $sparkBook")
  println(s"Scala Book = $scalaBook")

  println("\nStep 3: How to access fields of the Book object")
  println(s"Spark Book name field = ${sparkBook.name}")
  println(s"Spark Book price field = ${sparkBook.price}")
  println(s"Spark Book productCode field = ${sparkBook.productCode}")
  
  /*Scala favours the use of immutability. As a results, 
   * fields defined on case class are immutable by default and as such you cannot modify them.
   */

  println("\nStep 4: How to modify or update fields of the Book object")
  // sparkBook.name = "Learning NEW Spark" // compiler error. fields are immutable by default.

  println("\nStep 5: How to define the hashCode and equals method for Book object")
  val shoppingCart: Map[Book, Int] = Map(sparkBook -> 4, scalaBook -> 3)
  println(s"All items in shopping cart = ${shoppingCart}")
  println(s"Quantity of Spark Book in shopping cart = ${shoppingCart(sparkBook)}")
  println(s"Quantity of Scala Book in shopping cart = ${shoppingCart(scalaBook)}")

  
  /* TIP
   * A case class also comes with a handy copy() method which you can use to
   *  copy an object and override any field. 
   *  
   * In return, the copy() method will create new instances of the given object.
   */
  println("\nTIP: How to create a new object of Book by using the copy() method of the case class")
  val newSparkScalaBook: Book = sparkBook.copy(name = "Learning Spark Scala Version 2", price = 5.0)
  println(s"Spark And Scala Book = $newSparkScalaBook")
}