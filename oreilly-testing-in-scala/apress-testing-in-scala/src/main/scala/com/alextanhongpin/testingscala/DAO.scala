package com.alextanhongpin.testingscala

trait DAO {
	def persist[T](t:T)
}
