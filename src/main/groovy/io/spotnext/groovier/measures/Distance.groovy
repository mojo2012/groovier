package io.spotnext.groovier.measures

class Distance implements Comparable {
	Number length
	DistanceUnit unit

	Distance plus(Distance operand) {
		def newLength = this.length + DistanceUnit.convertUnit(operand, this.unit)
		return new Distance(length : newLength, unit : this.unit)
	}

	Distance minus(Distance operand) {
		def newLength = this.length - DistanceUnit.convertUnit(operand, this.unit)
		return new Distance(length : newLength, unit : this.unit)
	}

	int compareTo(Object other) {
		if (!(other instanceof Distance)) {
			return -1
		}

		Distance otherDistance = other

		if(this.unit == otherDistance.unit) {
			return this.length <=> otherDistance.length
		}

		return this.length <=> DistanceUnit.convertUnit(otherDistance, this.unit)
	}

	String toString() {
		return "$length $unit.name"
	}
}