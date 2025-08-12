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



private Coordinate CalculateV3 (Coordinate coord1, Coordinate coord2, Coordinate coord3, Coordinate coord4) {
	    Random randomGenerator = new Random();
	    Coordinate newCoord = new Coordinate() {Latitude = randomGenerator.Next((int)coord4.Latitude, (int)coord2.Latitude)};
	    double m1, m2, maxLong, minLong;
	    if (newCoord.Latitude > coord1.Latitude) {
		m1 = (coord2.Longitude - coord1.Longitude) / (coord2.Latitude - coord1.Latitude);
		m2 = (coord2.Longitude - coord3.Longitude) / (coord2.Latitude - coord3.Latitude);
		maxLong = (newCoord.Latitude - coord2.Latitude) * m1;
		minLong = (newCoord.Latitude - coord2.Latitude) * m2;
	    } else {
		m1 = (coord4.Longitude - coord1.Longitude) / (coord4.Latitude - coord1.Latitude);
		m2 = (coord4.Longitude - coord3.Longitude) / (coord4.Latitude - coord3.Latitude);
		maxLong = (newCoord.Latitude - coord4.Latitude) * m1;
		minLong = (newCoord.Latitude - coord4.Latitude) * m2;
	    }
	    newCoord.Longitude = randomGenerator.Next((int) Math.Ceiling(minLong), (int) Math.Floor(maxLong));
	    return newCoord;
}


