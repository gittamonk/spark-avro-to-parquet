   package com.technogeeks.scala.oo.m3

object ForLoop extends App {
    println("Step 1: A simple for loop from 1 to 5 inclusive")
  for(numberOfBooks <- 1 to 5){
    println(s"Number of books to buy = $numberOfBooks")
  }



  println("\nStep 2: A simple for loop from 1 to 5, where 5 is NOT inclusive")
  for(numberOfBooks <- 1 until 5){
    println(s"Number of books to buy = $numberOfBooks")
  }
  
    println("\n: A simple for loop from 1 to 5, incrementing by 2")
   for(numberOfBooks <- 1 to 5 by 2){
    println(s"Number of books to buy = $numberOfBooks")
  }




  println("\nStep 3: Filter values using if conditions in for loop")
  val bookTypes = List("scala", "hadoop", "spark", "bigdata", "kafka","scala")
  for(findBook <- bookTypes if findBook == "scala")
  {
    println(s"Found book types as = $findBook")
    
  }

/* YIELD
 * 
 * For each iteration of your for loop, yield generates a value which will be remembered. 
 * It's like the for loop has a buffer you can’t see, and for each iteration of your for loop another
 *  item is added to that buffer. When your for loop finishes running, it will return this collection of all the yielded
 *   values. The type of the collection that is returned is the same type that you were iterating over,
 *    so a Map yields a Map, a List yields a List, and so on.
 */

  println("\nStep 4: Filter values using if conditions in for loop and return the result back using the yield keyword")
  val listFindBooks = for {
    findBook <- bookTypes
    if (findBook == "scala" || findBook == "hadoop")
  } yield findBook
  println(s"List findBooks = $listFindBooks")

  val numbers = for {
    findBook <- 1 to 10
  } yield findBook*2
  
 
  
  // 2 ,4,6 
  //1,1,2,2,3,
  //(1*2),(2*2),(3*2),(4*2)
  
    println(s"Print Numbers = $numbers")



  println("\nStep 5: Using for comprehension to loop through 2-Dimensional array")
  val twoDimensionalArray = Array.ofDim[String](2,2)
  
  // [ 00, 01]
  // [ 10,11]
  
  twoDimensionalArray(0)(0) = "scala"
  twoDimensionalArray(0)(1) = "spark"
  twoDimensionalArray(1)(0) = "hadoop"
  twoDimensionalArray(1)(1) = "kafka"

  for { x <- 0 until 2 
    y <- 0 until 2
  } println(s" findBook at index ${(x,y)} = ${twoDimensionalArray(x)(y)}")
  
  /*
   def scalaFiles = 
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
  } yield file
  
   */
  //MULTIPLE RANGES USING IN LOOP AND USING A CONDITION AGAINST THE SCALA LOOP
  
   var a = 0;
      var b = 0;
    
      // for loop execution with a range
      
      

      for( a <- 1 to 3; b <- 1 to 3){
         println( "This is value of a: " + a );
         println( "This is value of b: " + b );
      }
      
      /*
       * 1
       * 1
       * 1
       * 2
       * 1
       * 3
       * 2
       * 1
       * 2
       * 2
       * 2
       * 3
       * 
       * 
       */
      
    
      //mutlirange with condition
           for( a <- 1 to 3; b <- 1 to 3 if a==b){
         println( "This is value of a with condition: " + a +" :: "+ b);
         //println( "This is value of b with condition: " + b );
      }
           /*
            * 1 :: 1
            * 2 :: 2
            * 3 :: 3
            * 
            */
  
}