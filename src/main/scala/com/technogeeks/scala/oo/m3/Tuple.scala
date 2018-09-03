package com.technogeeks.scala.oo.m3

object Tuple extends App{
  val t = (11,22,33,44)

   val sum = t._1 + t._2 + t._3 + t._4
   println("First Element : " + t._1)

   println( "Sum of elements: "  + sum )
   
   //Start with 1 and not from 0
   println( "First Value: "  + t._1 )
   
  
   
   
   val intList = List(2,7,9,1,6,5,8,2,4,6,2,9,8)
   
   val quicktry = intList.partition (_ > 2)

      val (big1,small) = intList.partition (_ > 5)

   
   //val quicktry = intList.partition (fun(x) => x >2)
   

      
   println(" big numbers" + big1)
   println(" small numbers" + small)
   println("Merge Numbers " +(big1++small))
   println("Merge Numbers " +(big1:::small))

   println(" quicktry"+quicktry._1)
   println(" quicktry"+quicktry._2)
    println(" quicktry"+quicktry)
    println(" quicktry"+quicktry.getClass)
    
    
    /* ****************************************************************************** */
  
  println("Step 1: Using Tuple2 to store 2 data points")
  val sparkBook = Tuple2("Learning Spark", "Good")
  println(s"Spark Book with 2 data points = $sparkBook")



  println("\nStep 2: Access each element in tuple")
  val sparkBookName = sparkBook._1
  val sparkLevel = sparkBook._2
  println(s"$sparkBookName  book level is $sparkLevel")



  println("\nStep 3: Using TupleN classes to store more than 2 data points")
  val scalaBook = Tuple3("Learning Scala", "Very Good", 2.50)
  println(s"${scalaBook._1} book leve is ${scalaBook._2} and it's price is ${scalaBook._3}")



  println("\nStep 4: How to use pattern matching on Tuples")
  val hadoopBook = Tuple3("Learning Hadoop", "Good", 3.50)
  val pigBook = Tuple3("Learning Pig", "Nice", 2)

  val bookList = List(scalaBook, hadoopBook, pigBook)
  val priceOfPigBook = bookList.foreach { tuple => {
    tuple match {
      case ("Learning Pig", typeBook, price) => println(s"Book type = Learning Pig, price = $price")
      case dd if dd._1 == "Learning Hadoop" => println(s"Book type dd = ${dd._1}, price = ${dd._3}")
      case _ => None
      }
    }
  }



  println("\nStep 5: Shortcut for creating Tuples")
  val shortBook = ("Learning Short", "Very Nice", 3.0)
  println(s"Shot Book level = ${shortBook._2}, price = ${shortBook._3}")



  println("\nTip 1: A more elegant pattern matching within foreach function")
  bookList.foreach {
    case ("Learning Scala", typeBook, price) => println(s"Book type = Learning Scala, price = $price")
    case d if d._1 == "Learning Hadoop " => println(s"Book type = ${d._1}, price = ${d._3}")
    case _ => None
  }
}