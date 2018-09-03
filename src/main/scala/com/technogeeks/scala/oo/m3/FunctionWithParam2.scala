package com.technogeeks.scala.oo.m3

object FunctionWithParam2 extends App{
  println("Step 1: How to define function with parameters")
  def calculateBookCost(bookName: String, quantity: Int): Double = {
    println(s"Calculating cost for $bookName, quantity = $quantity")

    // make some calculations ...
    2.50 * quantity
  }

  

  
  /*
   * NOTE:
We've stored the value which is returned from our calculateBookCost function into an immutable 
variable called totalCost.

Notice also that we are using Scala's type inference with the totalCost
 variable and as such did not explicitly specified its type of Double. 
 
In large code-base however, be wise about being explicit for your data points where necessary.
   */
  println("\nStep 2: How to call a function with parameters")
  val totalCost = calculateBookCost("Programming Scala", 5)
  println(s"Total cost of books = $totalCost")


  /*
   NOTE:
Limit your use of defaulting parameters for simple cases only.

There are better ways to achieve the desired effect of some customers presenting a 
coupon code such as using Option which we will see in the next tutorial.
   */

  println("\nStep 3: How to add default values to function parameters")
  def calculateBookCost(bookName: String, quantity: Int, couponCode: String = "NO CODE"): Double = {
    println(s"Calculating cost for $bookName, quantity = $quantity, couponCode = $couponCode")

    // make some calculations ...
    2.50 * quantity
  }

/*
 * NOTE:
If you were using Java, you would have had to use method overloading to achieve the 
same desired effect.

However, the ability to provide a default value to function parameters 
in Scala is a much more elegant solution!
 */

  println("\nStep 4: How to call a function with parameters that has default values")
  val totalCostWithDiscount = calculateBookCost("Hadoop Definitive Guide", 4, "COUPON_12345")
  val totalCostWithoutDiscount = calculateBookCost("Hadoop Definitive Guide", 4)
  
    println(s"Total cost of books with Discount = $totalCostWithDiscount")
    println(s"Total cost of books without Discount = $totalCostWithDiscount")

}