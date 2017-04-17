package com.alextanhongpin.chapter02

import breeze.linalg._

object HelloWorld {
  def main(args: Array[String]) {
    val v = DenseVector(1.0, 2.0, 3.0)
    println(v)
    println(v(1))

    // Element-wise multiplication
    println(v :* 2.0)

    // Element-wise operation with another vector
    println(v :+ DenseVector(4.0, 5.0, 6.0))

    val v2 = DenseVector(4.0, 5.0, 6.0)
    println(v dot v2)
  }
}

