package com.alextanhongpin.testingscala

import org.scalatest._
import org.scalatest.FunSpec

class AlbumFixtureSpec extends FunSpec with Matchers {
	def fixture = new {
		val letterFromHome = new Album("Letter from Home", 1989,
			new Band("Pat Metheny Group"))
	}
	describe("The Letter from Home album by Pet Metheny") {
		it ("should get the year 1989 from the album") {
			val album = fixture.letterFromHome
			album.year should be (1989)
		}
	}
}