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




private Coordinate CalculateV1 (Coordinate loc1, Coordinate loc2, Coordinate loc3, Coordinate loc4) {
	    var rand = new System.Random();
	    var newCoordinate = new Coordinate(){Latitude = rand.Next((int)loc4.Latitude, (int)loc2.Latitude)};
	    double slope1, slope2, maxLong, minLong;
	    if (newCoordinate.Latitude > loc1.Latitude) {
		slope1 = (loc2.Longitude - loc1.Longitude) / (loc2.Latitude - loc1.Latitude);
		slope2 = (loc2.Longitude - loc3.Longitude) / (loc2.Latitude - loc3.Latitude);
		maxLong = (newCoordinate.Latitude - loc2.Latitude) * slope1;
		minLong = (newCoordinate.Latitude - loc2.Latitude) * slope2;
	    } else {
		slope1 = (loc4.Longitude - loc1.Longitude) / (loc4.Latitude - loc1.Latitude);
		slope2 = (loc4.Longitude - loc3.Longitude) / (loc4.Latitude - loc3.Latitude);
		maxLong = (newCoordinate.Latitude - loc4.Latitude) * slope1;
		minLong = (newCoordinate.Latitude - loc4.Latitude) * slope2;
	    }
	    
	    newCoordinate.Longitude = rand.Next((int)Math.Ceiling(minLong), (int)Math.Floor(maxLong));
	    return newCoordinate;
}


