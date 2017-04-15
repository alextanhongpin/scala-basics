package com.alextanhongpin.testingscala

import org.scalatest._
import org.scalatest.FunSpec

class AlbumTest extends FunSpec with Matchers {
	describe("An album") {
		ignore ("can add an Artist object to the album") {
			val album = new Album("Thriller", 1981, new Artist("Michael", "Jackson"))

			album.title should be ("Thriller")
		}
	}
}