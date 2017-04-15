package com.alextanhongpin.testingscala

import org.scalatest.{FunSpec, Spec}
import org.scalatest._

class ShouldMatcherSpec extends FunSpec with Matchers {

	describe("Using all should matchers") {
		it ("has simple matchers") {
			val list = 2 :: 4 :: 5 :: Nil
			list.size should be (3)
		}

		it ("has string matchers") {
			val string = """I fell into a burning ring of fire.
			I went down, down, down and the flames went higher"""

			string should startWith("I fell")
			string should endWith("higher")
			string should not endWith("My favorite friend, the end")
			string should include("down, down, down")
			string should not include ("Great balls of fire")

			string should startWith regex("I.fel+")
			string should endWith regex("h.{4}r")
			string should not endWith regex("\\d{5}")
			string should include regex("flames?")

			string should fullyMatch regex("""I(.|\n|\S)*higher""")
		}

		it ("has <, >, <=, >=, === matchers") {
			val answerToLife = 42
			answerToLife should be < (50)
			answerToLife should not be > (50)
			answerToLife should be > (3)
			answerToLife should be <= (100)
			answerToLife should be >= (0)
			answerToLife should be (42)
			answerToLife should not be (400)
		}
	}

}