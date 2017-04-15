package com.alextanhongpin.testingscala

import org.scalatest._
import org.scalatest.FreeSpec

class JukeboxFreeSpec extends FreeSpec with Matchers {
  "Given 3 albums" - {
    val badmotorfinger = new Album("Badmotorfinger", 1991, None, new Band("Soundgarden"))
    val thaDoggFather = new Album("The Dogg Father", 1996, None, new Artist("Snoop Doggy", "Dogg"))
    val satchmoAtPasadena = new Album("Satchmo At Pasadena", 1951, None, new Artist("Louis", "Armstrong"))
    "when a juke box is instantiated it should accept some albums" - {
      val jukebox = new JukeBox(Some(List(badmotorfinger, thaDoggFather, satchmoAtPasadena)))
      "then a jukebox's album catalog size should be 3" in {
        jukebox.albums.get should have size (3)
      }
    }
  }

  "El constructor de Jukebox puedo aceptar la palabra clave de 'None'" - {
    val jukebox = new JukeBox(None)
    "y regresas 'None' cuando llamado " in {
      jukebox.albums should be(None)
    }
  }
}