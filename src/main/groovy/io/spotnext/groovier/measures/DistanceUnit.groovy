package io.spotnext.groovier.measures

class DistanceUnit {
	
	Integer ratio
	String name
	
	// formatter:off
	static List<List<Double>> ratioTable = [
		//        mm,         cm,          m,        km,    y,   mi
		[          1,          0,          0,         0,    0, 0 ],    // mm
		[         10,          1,          0,         0,    0, 0 ],    // cm
		[        1e3,        1e2,          1,         0,    0, 0 ],    //  m
		[        1e6,        1e5,        1e3,         1,    0, 0 ],    // km
		[      914.4,      91.44,     0.9144, 0.9144e-3,    1, 0 ],    // yd
		[ 1.609344e6, 1.609344e5, 1.609344e3,  1.609344, 1760, 1 ],    // mi
		]
	// formatter:on

	
	static Number convertUnit(Distance distance, DistanceUnit newUnit) {
		def factor = ratioTable.get(distance.unit.ratio).get(newUnit.ratio)
		
		if (factor) {
			return distance.length * factor
		} else {
			return distance.length / ratioTable[newUnit.ratio][distance.unit.ratio]
		}
	}
	
	public static final DistanceUnit mm = new DistanceUnit(ratio : 0, name : "millimeter")
	public static final DistanceUnit cm = new DistanceUnit(ratio : 1, name : "centimeter")
	public static final DistanceUnit m = new DistanceUnit(ratio : 2, name : "meter")
	public static final DistanceUnit km = new DistanceUnit(ratio : 3, name : "kilometer")
	public static final DistanceUnit yd = new DistanceUnit(ratio : 4, name : "yard")
	public static final DistanceUnit mi = new DistanceUnit(ratio : 5, name : "mile(s)")
}