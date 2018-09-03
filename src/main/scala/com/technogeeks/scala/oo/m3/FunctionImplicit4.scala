package com.technogeeks.scala.oo.m3

object FunctionImplicit4 extends App{
   println(s"Step 1: How to define a function with an implicit parameter")
  def totalCost(bookName: String, quantity: Int)(implicit discount: Double): Double = {
    println(s"Calculating the price for $quantity $bookName")
    val totalCost = 2.50 * quantity * (1 - discount)
    totalCost
  }

  println("\nStep 2: How to define an implicit value")
  implicit val discount: Double = 0.1
  println(s"All customer will receive a ${discount * 100}% discount")

  println("\nStep 3: How to call a function which has an implicit parameter")
  println(s"""Total cost with discount of 5 book of "Programming Scala is " = ${totalCost("Programming Scala", 5)}""")

  println("\nStep 4: How to define a function which takes multiple implicit parameters")
  def totalCost2(bookName: String, quantity: Int)(implicit discount: Double, storeName: String): Double = {
    println(s"[$storeName] Calculating the price for $quantity $bookName")
    val totalCost = 2.50 * quantity * (1 - discount)
    totalCost
  }

  println("\nStep 5: How to call a function which takes multiple implicit parameters")
  implicit val storeName: String = "TechnoGeeks Library"
  println(s"""Total cost with discount of 5 book of "Programming Scala is " = ${totalCost2("Programming Scala", 5)}""")

  println("\nStep 6: How to manually pass-through implicit parameters")
  println(s"""Total cost with discount of 5 Scala Books is, manually passed-through = ${totalCost2("Learning Scala", 5)(0.1, "Technogeeks Library Store")}""")

}