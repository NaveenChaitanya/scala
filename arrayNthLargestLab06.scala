package com.practice
import scala.io.StdIn._
import Array._
object arrayNthLargestLab06 extends App{
  
  print("Enter Array Elements with ',' seperate:")
  var str_elements =readLine()
  //split and convert values into String Array and get distinct values and create a sorted list 
  val int_lst=(str_elements.split(",")).distinct.map(_ .toInt) .toList.sorted
  
  print(s"Enter the number between 1-${int_lst.length } to find the nth maximum :")
  var n =readInt()
  println("Elements sorted list" +int_lst)
  println(s"$n th Maximum number in the Array:${int_lst(n-1)}")
  
}