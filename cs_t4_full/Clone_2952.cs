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


 
private Coordinate CalculateV7 (Coordinate place1, Coordinate place2, Coordinate place3, Coordinate place4) {
	    var rng = new Random();
	    var coord = new Coordinate() {Latitude = rng.Next((int)place4.Latitude, (int)place2.Latitude)};
	    double m1, m2, maxLng, minLng;
	    if (coord.Latitude > place1.Latitude) {
		m1 = (place2.Longitude - place1.Longitude) / (place2.Latitude - place1.Latitude);
		m2 = (place2.Longitude - place3.Longitude) / (place2.Latitude - place3.Latitude);
		maxLng = (coord.Latitude - place2.Latitude) * m1;
		minLng = (coord.Latitude - place2.Latitude) * m2;
	    } else {
		m1 = (place4.Longitude - place1.Longitude) / (place4.Latitude - place1.Latitude);
		m2 = (place4.Longitude - place3.Longitude) / (place4.Latitude - place3.Latitude);
		maxLng = (coord.Latitude - place4.Latitude) * m1;
		minLng = (coord.Latitude - place4.Latitude) * m2;
	    }
	    coord.Longitude = rng.Next((int) Math.Ceiling(minLng), (int) Math.Floor(maxLng));
	    return coord;
}


