package com.technogeeks.scala.oo.m3

object IfThanElse extends App{
   println("Step 1: Using if clause as a statement")
  val numberOfBooks = 20
  val booksPerPerson = 2

  if (numberOfBooks > 10)
    println(s"Number of books to buy = ${numberOfBooks * booksPerPerson}") //40

  println(s"\nStep 2: Using if and else clause as a statement")
  val defaultBooksToBuy = 5

  if (numberOfBooks > 10)
    println(s"Number of books to buy = ${numberOfBooks * booksPerPerson}") //40
  else
    println(s"Number of books to buy = $defaultBooksToBuy")

  println("\nStep 3: Using if, else if, and else clause as a statement")
  if (numberOfBooks > 10) {
    println(s"Number of books to buy = ${numberOfBooks * booksPerPerson}") //40
  } else if (numberOfBooks == 0) {
    println("Number of people is zero.")
    println("No need to buy books.")
  } else {
    println(s"Number of books to buy = $defaultBooksToBuy")
  }

  println("\nStep 4: Using if and else clause as expression")
  val numberOfBooksToBuy = if (numberOfBooks > 10) (numberOfBooks * booksPerPerson) else defaultBooksToBuy
  println(s"Number of books to buy = $numberOfBooksToBuy") //40
   // println("Number of books to buy =" +numberOfBooksToBuy)

  
  
  // IF ELSE WORKING IN THE FUNCTIONAL PROGRAMMING
  
   //as scala is functional programme, assign result from scala 
      //if statement in a simple function
  
   // def  <function_Name>(arguments:<type of the arg,>)
      def abs(x:Int) = {
    if (x >= 0) 
      x 
    else 
      -x
      }
      
      println("calling abs function "+abs(4)) //4
      println("calling abs function "+abs(-1)) //1
}