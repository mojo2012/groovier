package io.spotnext.groovier.sql

class Sql implements SelectPart, FromPart, FullQueryPart {
	String[] columns
	String from

	static Sql query(Closure query) {
		def self = new Sql()
		query.delegate = self		
		query()
		return self
	}
	
	static SelectPart select(String ... columns) {
		def self = new Sql()
		self.columns = columns

		return self
	}

	FromPart from(String table) {
		this.from = table
		return this
	}

	FullQueryPart where() {
		return this
	}
	
	def execute() {
		println("SELECT $columns FROM $from")
	}

	static interface SelectPart {
		FromPart from(String table)
	}

	static interface FromPart {
		FullQueryPart where()
		def execute()
	}

	static interface FullQueryPart {
		def execute()
	}
}
