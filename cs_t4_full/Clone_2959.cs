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


 
private Coordinate CalculateV5 (Coordinate p1, Coordinate p2, Coordinate p3, Coordinate p4) {
	    Random randomizer = new Random();
	    Coordinate randomCoord = new Coordinate() {Latitude = randomizer.Next((int)p4.Latitude, (int)p2.Latitude)};  
	    double m1, m2, maxLng, minLng;
	    if (randomCoord.Latitude > p1.Latitude) {
		m1 = (p2.Longitude - p1.Longitude) / (p2.Latitude - p1.Latitude);
		m2 = (p2.Longitude - p3.Longitude) / (p2.Latitude - p3.Latitude);
		maxLng = (randomCoord.Latitude - p2.Latitude) * m1;
		minLng = (randomCoord.Latitude - p2.Latitude) * m2;
	    } else {
		m1 = (p4.Longitude - p1.Longitude) / (p4.Latitude - p1.Latitude);
		m2 = (p4.Longitude - p3.Longitude) / (p4.Latitude - p3.Latitude);
		maxLng = (randomCoord.Latitude - p4.Latitude) * m1;
		minLng = (randomCoord.Latitude - p4.Latitude) * m2;
	    }
	    randomCoord.Longitude = randomizer.Next((int) Math.Ceiling(minLng), (int) Math.Floor(maxLng));
	    return randomCoord;
}


