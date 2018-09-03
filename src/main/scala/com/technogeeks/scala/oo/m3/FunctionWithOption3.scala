package com.technogeeks.scala.oo.m3

object FunctionWithOption3 extends App{
    /*
   * NOTE:
Inside our function, we will test for a valid couponCode using pattern matching.

In the case of Some(coupon), we assume a database lookup for the discount 
that needs to be applied. But, in our example, we will assume the discount is 10%.

As part of the pattern matching, we also provide the None case where no couponCode was passed-through.
   */
  println("Step 1: How to define an Option in a function parameter")
  def calculateBookCost(bookName: String, quantity: Int, couponCode: Option[String]): Double = {
    println(s"Calculating cost for $bookName, quantity = $quantity")

    couponCode match {
      case Some(coupon) =>
        val discount = 0.1 // Let's simulate a 10% discount
        val totalCost = 2.50 * quantity * (1 - discount)
        totalCost

      case None => 2.50 * quantity
    }
  }


/*
 * NOTE:
Since our customer does not have a couponCode, we had to supply a None as the couponCode parameter.

Providing a None for every Option parameter is perhaps not very elegant. 
Fortunately, this is easily solved - see Step 3 below.
 */
  println("\nStep 2: How to call a function which has an Option parameter")
  println(s"""Total cost = ${calculateBookCost("Programming with Scala", 5, None)}""")



  println("\nStep 3: How to assign a default value to an Option parameter")
  def calculateBookCostWithDefaultOptionValue(bookName: String, quantity: Int, couponCode: Option[String] = None): Double = {
    println(s"Calculating cost for $bookName, quantity = $quantity")

    couponCode match{
      case Some(coupon) =>
        val discount = 0.1 // Let's simulate a 10% discount
        val totalCost = 2.50 * quantity * (1 - discount)
        totalCost

      case _ => 2.50 * quantity
    }
  }



  println("\nStep 4: How to call a function which has an Option parameter with a default value")
  println(s"""Total cost = ${calculateBookCostWithDefaultOptionValue("Learning Scala", 5)}""")
  println(s"""Total cost with discount = ${calculateBookCostWithDefaultOptionValue("Learning Scala", 5, Some("COUPON_1234"))}""")



  println(s"\nTip 1: Use the map function to extract a valid Option value")
  val favoriteBook: Option[String] = Some("Hadoop Guide")
  favoriteBook.map(d => println(s"Favorite book = $d"))

  val leastFavoriteBook: Option[String] = None
  leastFavoriteBook.map(d => println(s"Least Favorite book = $d"))
  
}