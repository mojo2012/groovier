package io.spotnext.groovier

import io.spotnext.groovier.measures.Distance
import io.spotnext.groovier.measures.DistanceUnit

class DistanceExtension {
	static Distance getMm(Number n) {
		return new Distance(length : n, unit : DistanceUnit.mm)
	}

	static Distance getMm(Distance d) {
		return new Distance(length : DistanceUnit.convertUnit(d, DistanceUnit.mm), unit : DistanceUnit.mm)
	}

	static Distance getCm(Number n) {
		return new Distance(length : n, unit : DistanceUnit.cm)
	}

	static Distance getCm(Distance d) {
		return new Distance(length : DistanceUnit.convertUnit(d, DistanceUnit.cm), unit : DistanceUnit.cm)
	}

	static Distance getM(Number n) {
		return new Distance(length : n, unit : DistanceUnit.m)
	}

	static Distance getM(Distance d) {
		return new Distance(length : DistanceUnit.convertUnit(d, DistanceUnit.m), unit : DistanceUnit.m)
	}

	static Distance getKm(Number n) {
		return new Distance(length : n, unit : DistanceUnit.km)
	}

	static Distance getKm(Distance d) {
		return new Distance(length : DistanceUnit.convertUnit(d, DistanceUnit.km), unit : DistanceUnit.km)
	}

	static Distance getYd(Number n) {
		return new Distance(length : n, unit : DistanceUnit.m)
	}

	static Distance getYd(Distance d) {
		return new Distance(length : DistanceUnit.convertUnit(d, DistanceUnit.yd), unit : DistanceUnit.yd)
	}

	static Distance getMi(Number n) {
		return new Distance(length : n, unit : DistanceUnit.mi)
	}

	static Distance getMi(Distance d) {
		return new Distance(length : DistanceUnit.convertUnit(d, DistanceUnit.mi), unit : DistanceUnit.mi)
	}
}