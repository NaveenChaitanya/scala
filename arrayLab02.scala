package com.practice
import scala.io.StdIn._

//split string and assign values to array
object arrayLab02 extends App{
  
  print("Enter values with ',' seperated:")
  var s =readLine()
  var arr = s.split(",")
  for (i <- 0 until arr.length)
    println(arr(i))
    
    //assign numbers -- value type  Any Value and subset
  val numArray =Array(1,2,3,4,5,6,7,8)
  //print numArray
  println("Print Any value array elements with  for loop")
  for (i <- numArray)
    println(i)
    
  
}