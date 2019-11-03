package io.spotnext.groovier

import org.junit.Test
import io.spotnext.groovier.sql.Sql

class SqlTest {

	@Test
	void testCreateSql() {
		def show = { println it }
		def square_root = { double it -> Math.sqrt(it) }

		Sql.select "a", "b" \
			from "table" \
			execute()
		
	}
}
