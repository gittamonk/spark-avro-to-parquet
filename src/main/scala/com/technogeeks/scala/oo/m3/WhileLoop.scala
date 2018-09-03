package com.technogeeks.scala.oo.m3

object WhileLoop extends App{
  println("Step 1: How to use while loop in Scala")
  var numberOfBooksToBuy = 10
  while (numberOfBooksToBuy > 0) {
    println(s"Remaining books to be bought = $numberOfBooksToBuy")
    numberOfBooksToBuy -= 1
  }



  println("\nStep 2: How to use do while loop in Scala")
  var numberOfBooksBought = 0
  do {
    numberOfBooksBought += 1
    println(s"Number of books bought = $numberOfBooksBought")
  } while (numberOfBooksBought < 5)

}