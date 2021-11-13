package com.practice
import scala.io.StdIn._
object arrayLab03 extends App{
  
  var arrInt = Array(100,2,590,1,8,2,34,5,6,98,48,19,9385,4850,1940,85,93)
  //find out max and min elements
  var max =arrInt(0)
  var min =max
  var tot =0
  for(i <- arrInt)
  {
    max = if(i>max) i else max;
    min = if(i<min) i else min;
    tot+=i
  }
    println("Max element in the array =" +max)
    println("Min element in the array =" +min)
    println("Summation of elements="+tot)
    println("Average of elements="+ (tot/arrInt.length) )

}