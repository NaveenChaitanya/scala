package com.practice
import scala.io.StdIn._
object arrayLab01 extends App{
  //Define array lenth
  print("Enter array Size:")
  val  size=readInt()
  //array declaration
  var arr =new Array[String](size)
//alternate declare arrya: var arr1:Array[String] =new Array[String](size)
  // length of array
  println(s"Length of array: ${arr.length}")
  // array elements
  for (i <- 0 until arr.length)
  {
    print (s" read array element $i:")
    arr(i)=readLine()
  }
  var pos =0
  do 
  {
    
    println(arr(pos))
    pos=pos+1
  }
while(pos < arr.length)
  
}  