package com.alextanhongpin.testingscala

import org.scalacheck.{Prop, Properties}

object BasicScalaCheckProperties extends Properties("Simple Math") {
	property("Sums are associative") = Prop.forAll { (x: Int, y: Int) => x + y == y + x }
}