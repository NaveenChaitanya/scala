package com.practice
import scala.io.StdIn._
import Array._
import scala.util.Sorting._
object arrayMultiDimLab04 extends App{
print("Ener # of Rows:")
var rows=readInt()
print("Enter # of Columns:")
var cols = readInt()
  
  
  var arrMulDim = ofDim[Int](rows,cols)
  
for (i <- 0 until rows; j <- 0 until cols)
{
  arrMulDim (i)(j)= i+j
}

for( i <-0 until rows; j <- 0 until cols)
{
  if( j==0) println("")
  print(arrMulDim (i)(j)+ " ")
}

//example to conact arrays
var arr1=Array(1,2,3.0,4.0)
var arr2=Array("ant","elephant","dog","cat","cow")
var arr3=Array(2.0,9.0,8.0)
var arrcon =concat(arr1,arr3)
val arrList =arrcon.toList.sortWith(_ < _)
println("")
for (a <- 0 until arrList.length) print(a + " ")


println("")

for(i <- 0 until arr2.length) print(arr2(i) + ", ")
quickSort(arr2)
println("\nSorted Array")
for(i <- 0 until arr2.length) print(arr2(i) + ", ")




}