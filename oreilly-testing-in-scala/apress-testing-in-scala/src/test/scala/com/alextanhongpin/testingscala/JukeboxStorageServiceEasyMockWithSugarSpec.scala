package com.alextanhongpin.testingscala

import org.scalatest._
import org.scalatest.mock.EasyMockSugar
import org.easymock.EasyMock._


class JukeboxStorageServiceEasyMockWithSugarSpec extends FunSpec with Matchers with EasyMockSugar {
	describe("A Jukebox Storage Service") {
		it("should use easy mock to mock out the DAO classes") {
			val daoMock = createMock(classOf[DAO])

			val theGratefulDead: Band = new Band("Grateful Dead")
			val wyntonMarsalis: Artist = new Artist("Wynton", "Marsalis")
			val psychedelicFurs: Band = new Band("Psychedelic Furs")
			val ericClapton: Artist = new Artist("Eric", "Clapton")

			val workingmansDead = new Album("Workingman's Dead", 1970, None, theGratefulDead)
			val midnightToMidnight = new Album("Midnight to Midnight", 1987, None, psychedelicFurs)
			val wyntonAndClapton = new Album("Wynton Marsalis and Eric Clapton play the Blues", 2011, None, wyntonMarsalis, ericClapton)

			val jukeBox = new JukeBox(Some(List(workingmansDead, midnightToMidnight, wyntonAndClapton)))

			val jukeboxStorageService = new JukeboxStorageService(daoMock)

			expecting {
				daoMock.persist(workingmansDead)
				daoMock.persist(midnightToMidnight)
				daoMock.persist(wyntonAndClapton)

				daoMock.persist(theGratefulDead)
				daoMock.persist(wyntonMarsalis)
				daoMock.persist(psychedelicFurs)
				daoMock.persist(ericClapton)
			}

			whenExecuting (daoMock) {
				jukeboxStorageService.persist(jukeBox)
			}

		}
	}
}