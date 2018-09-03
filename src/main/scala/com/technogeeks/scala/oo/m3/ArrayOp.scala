package com.technogeeks.scala.oo.m3

object ArrayOp extends App{
  println("Step 1: How to initialize a String Array with 3 elements")
  val array1: Array[String] = Array("Scala","Hadoop","Big Data") //literals
  println(s"Elements of array1 = ${array1.mkString(", ")}")



  println("\nStep 2: How to access elements at specific index in an Array")
  println(s"Element at index 0 = ${array1(0)}") //Scala
  println(s"Element at index 1 = ${array1(1)}") //Hadoop
  println(s"Element at index 2 = ${array1(2)}") // Big Data

  


  println("\nStep 3: How to initialize an Array by specifying it's capacity")
  val array2: Array[String] = new Array(3)
  array2(0) = "Scala"
  array2(1) = "Hadoop"
  array2(2) = "Big Data"
  println(s"Elements of array2 = ${array2.mkString(", ")}")



  println("\nStep 4: How to create a 2D Array (2 dimension array)")
  val rows = 2
  val columns = 2
  val array3: Array[Array[String]] = Array.ofDim[String](rows,columns)
  array3(0)(0) = "Scala"                
  array3(0)(1) = "Hadoop"
  array3(1)(0) = "Scala1.1"
  array3(1)(1) = "Hadoop1.1"
  println(s"Elements of 2 dimensional array = ${array3.deep.toList}")



  println("\nStep 5: How to create 3D Array (3 Dimension Array) using Array.ofDim() method")
  val array4: Array[Array[String]] = Array.ofDim[String](3,3)
  println(s"Elements of 3 dimensional array = ${array4.deep.toList}")



  println("\nStep 6: How to create an Array using tabulate function")
  val array5: Array[Int] = Array.tabulate(5)(x => x +1) //x => x +1 function literal
    val array5test: Array[Int] = Array.tabulate(5)(_ + 1) // wildcard character

  
  println(s"Array of 5 columns = ${array5.toList}")
  
    println(s"Array of 5 columns = ${array5}")




  println("\nStep 7: How to create dimensional Arrays using tabulate function")
  val row1 = 1
  val column3 = 3
  val arrayOfOneRowAndThreeColumns = Array.tabulate(row1, column3)( (row, column) => row + column )
  println(s"Array with 1 row and 3 columns = ${arrayOfOneRowAndThreeColumns.deep.toString}")

  val row2 = 2
  val arrayOfTowRowsAndThreeColumns = Array.tabulate(row2, column3)( (row, column) => row + column )
  println(s"Array with 2 rows and 3 columns = ${arrayOfTowRowsAndThreeColumns.deep.toString}")

  val row3 = 3
  val arrayOfThreeRowsAndThreeColumns = Array.tabulate(row3, column3)( (row, column) => row + column )
  println(s"Array with 3 rows and 3 columns = ${arrayOfTowRowsAndThreeColumns.deep.toString}")



  println("\nStep 8: How to create Array using Range")
  val rangeArray: Array[Int] = (1 to 10 by 2).toArray[Int]
  println(s"Array using Range from 1 to 10 = ${rangeArray.mkString(", ")}")



  println("\nStep 9: How to copy an Array using Array.copy")
  val copyOfRangeArray: Array[Int] = new Array(rangeArray.size)
  Array.copy(rangeArray, 0, copyOfRangeArray, 0, rangeArray.size)
  println(s"copy of range array with elements from rangeArray = ${copyOfRangeArray.mkString(", ")}")



  println("\nStep 10: How to clone an Array")
  val clonedRangeArray = rangeArray.clone
  clonedRangeArray(0) = 10 // update index 0 to value 10
  println(s"clonedRangeArray = ${clonedRangeArray.mkString(", ")}")
  println(s"original range array still unchanged = ${rangeArray.mkString(", ")}")



  println("\nStep 11: How to iterate over an Array using for comprehension")
  for(d <- array1){
    println(s"d = $d")
  }



  println("\nStep 12: How to merge two Arrays using Array.concat")
  val moreSubjectsArray: Array[String] = Array("Spark","Spark Mlib")
  val mergedSubjectsArray: Array[String] = Array.concat(array1, moreSubjectsArray)
  println(s"Merged Array of Subjects = ${mergedSubjectsArray.mkString(", ")}")



  println("\nStep 13: How to check if two Arrays are equal")
  val arrayToCompare = Array[String]("Scala","Hadoop","Big Data")

  println(s"using == ${array1 == moreSubjectsArray}") // prints false

  println(s"using == ${array1 == arrayToCompare}") // ALSO prints false ??? what ... be careful

  println(s"using sameElement function = ${array1 sameElements arrayToCompare}") // NOW this works and returns true!



  println("\nStep 14: How to check if two Arrays are equal using deep function and == ")
  println(s"using deep function = ${array1.deep == arrayToCompare.deep}")
}