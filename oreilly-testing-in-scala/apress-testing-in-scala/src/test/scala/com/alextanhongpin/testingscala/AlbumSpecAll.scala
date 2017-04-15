package com.alextanhongpin.testingscala

import org.scalatest._
import org.scalatest.{Tag, GivenWhenThen, FunSpec}

class AlbumSpecAll extends FunSpec with Matchers with GivenWhenThen {
	describe("An Album") {
		it("can add an Artist to the album at construction time", Tag("construction")) {
			Given("The album Thriller by Michael Jackson")
			val album = new Album("Thriller", 1981, new Artist("Michael", "Jackson"))

			When("The artist of the album is obtained") 
			val act = album.acts.head

			Then("The artist should be an instance of Artist")
			act.isInstanceOf[Artist] should be (true)

			And("The artist's first name and last name should be Michael Jackson")
			val artist = act.asInstanceOf[Artist]
			artist.firstName should be ("Michael")
			artist.lastName should be ("Jackson")
			info("This is still pending, since there may be more to accomplish in this test")
			pending
		}

		ignore("can add a Producer to an album at construction time") {}
	}
}