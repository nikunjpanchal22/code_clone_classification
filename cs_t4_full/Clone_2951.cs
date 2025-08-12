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


 
private Coordinate CalculateV6 (Coordinate a, Coordinate b, Coordinate c, Coordinate d) {
	    Random rand = new Random ((int)DateTime.Now.Ticks & 0x0000FFFF);
	    Coordinate coor = new Coordinate {Latitude = rand.Next ((int) Math.Floor (d.Latitude), (int) Math.Floor (b.Latitude))};
	    double k1, k2, maxLon, minLon;
	    if (coor.Latitude > a.Latitude) {
		k1 = (b.Longitude - a.Longitude) / (b.Latitude - a.Latitude);
		k2 = (b.Longitude - c.Longitude) / (b.Latitude - c.Latitude);
		maxLon = (coor.Latitude - b.Latitude) * k1;
		minLon = (coor.Latitude - b.Latitude) * k2;
	    } else {
		k1 = (d.Longitude - a.Longitude) / (d.Latitude - a.Latitude);
		k2 = (d.Longitude - c.Longitude) / (d.Latitude - c.Latitude);
		maxLon = (coor.Latitude - d.Latitude) * k1;
		minLon = (coor.Latitude - d.Latitude) * k2; 
	    }
	    coor.Longitude = rand.Next ((int) Math.Ceiling (minLon), (int) Math.Floor (maxLon));
	    return coor;
}


