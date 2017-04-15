package com.alextanhongpin.testingscala

import org.scalatest._
import org.scalatest.FlatSpec
import org.joda.time.Period


class TrackFlatSpec extends FlatSpec with Matchers {
	behavior of "A track" 

	it should """have a constructor that accepts the name and the length of the track 
	in min:sec and returns a joda.time.Period when track.period is called""" in {
		val track = new Track("Last Dance", "5:00")
		track.period should be (new Period(0, 5, 0, 0))
	}

	it must """throw an IllegalArgumentException with the message \"Track name cannot be blank\"
	if the name of the track is blank.""" in {
		val exception = intercept[IllegalArgumentException] {
			new Track("")
		}
		//evaluating(new Track("")) must produce [IllegalArgumentException]
		exception.getMessage should be ("requirement failed: Track name cannot be blank")
	}
}