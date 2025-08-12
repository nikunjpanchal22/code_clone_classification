private Coordinate Calculate (Coordinate location1, Coordinate location2, Coordinate location3, Coordinate location4) {
    Random random = new Random (DateTime.Now.Millisecond);
    Coordinate randomCoordinate = new Coordinate () {Latitude = random.Next ((int) Math.Floor (location4.Latitude), (int) Math.Floor (location2.Latitude))};
    if (randomCoordinate.Latitude > location1.Latitude) {
        double m1 = (location2.Longitude - location1.Longitude) / (location2.Latitude - location1.Latitude);
        double m2 = (location2.Longitude - location3.Longitude) / (location2.Latitude - location3.Latitude);
        double maxLongitude = (randomCoordinate.Latitude - location2.Latitude) * m1;
        double minLongitude = (randomCoordinate.Latitude - location2.Latitude) * m2;
        randomCoordinate.Longitude = random.Next ((int) Math.Ceiling (minLongitude), (int) Math.Floor (maxLongitude));
    } else {
        double m1 = (location4.Longitude - location1.Longitude) / (location4.Latitude - location1.Latitude);
        double m2 = (location4.Longitude - location3.Longitude) / (location4.Latitude - location3.Latitude);
        double maxLongitude = (randomCoordinate.Latitude - location4.Latitude) * m1;
        double minLongitude = (randomCoordinate.Latitude - location4.Latitude) * m2;
        randomCoordinate.Longitude = random.Next ((int) Math.Ceiling (minLongitude), (int) Math.Floor (maxLongitude));
    }
    return randomCoordinate;
}



private Coordinate CalculateV8 (Coordinate point1, Coordinate point2, Coordinate point3, Coordinate point4) {
	    Random r = new Random(DateTime.Now.Millisecond);
	    Coordinate crd = new Coordinate {Latitude = r.Next((int)point4.Latitude, (int)point2.Latitude)};
	    double slope1, slope2, maxLong, minLong;
	    if (crd.Latitude > point1.Latitude) {
		slope1 = (point2.Longitude - point1.Longitude) / (point2.Latitude - point1.Latitude);
		slope2 = (point2.Longitude - point3.Longitude) / (point2.Latitude - point3.Latitude);
		maxLong = (crd.Latitude - point2.Latitude) * slope1;
		minLong = (crd.Latitude - point2.Latitude) * slope2;
	    } else {
		slope1 = (point4.Longitude - point1.Longitude) / (point4.Latitude - point1.Latitude);
		slope2 = (point4.Longitude - point3.Longitude) / (point4.Latitude - point3.Latitude);
		maxLong = (crd.Latitude - point4.Latitude) * slope1;
		minLong = (crd.Latitude - point4.Latitude) * slope2;
	    }
	    crd.Longitude = r.Next((int) Math.Ceiling(minLong), (int) Math.Floor(maxLong));
	    return crd;
}


