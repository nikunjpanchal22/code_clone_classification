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


 
private Coordinate CalculateV2 (Coordinate A, Coordinate B, Coordinate C, Coordinate D) {
	    Random r = new Random();
	    Coordinate coordinate = new Coordinate() {Latitude = r.Next((int) A.Latitude, (int) B.Latitude)};
	    double gradient1, gradient2, max, min;
	    if (coordinate.Latitude > A.Latitude) {
		gradient1 = (B.Longitude - A.Longitude) / (B.Latitude - A.Latitude);
		gradient2 = (B.Longitude - C.Longitude) / (B.Latitude - C.Latitude);
		max = (coordinate.Latitude - B.Latitude) * gradient1;
		min = (coordinate.Latitude - B.Latitude) * gradient2;
	    } else {
		gradient1 = (D.Longitude - A.Longitude) / (D.Latitude - A.Latitude);
		gradient2 = (D.Longitude - C.Longitude) / (D.Latitude - C.Latitude);
		max = (coordinate.Latitude - D.Latitude) * gradient1;
		min = (coordinate.Latitude - D.Latitude) * gradient2;
	    }
	    
	    coordinate.Longitude = r.Next ((int) Math.Ceiling(min), (int) Math.Floor(max));
	    return coordinate;
}


