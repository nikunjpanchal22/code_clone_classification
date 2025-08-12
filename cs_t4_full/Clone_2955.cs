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



private Coordinate CalculateV9 (Coordinate pos1, Coordinate pos2, Coordinate pos3, Coordinate pos4) {
	    var rnd = new Random();
	    Coordinate rnCoord = new Coordinate(){Latitude = rnd.Next((int)pos4.Latitude, (int)pos2.Latitude)};
	    double g1, g2, maxL, minL;
	    if (rnCoord.Latitude > pos1.Latitude) {
		g1 = (pos2.Longitude - pos1.Longitude) / (pos2.Latitude - pos1.Latitude);
		g2 = (pos2.Longitude - pos3.Longitude) / (pos2.Latitude - pos3.Latitude);
		maxL = (rnCoord.Latitude - pos2.Latitude) * g1;
		minL = (rnCoord.Latitude - pos2.Latitude) * g2;
	    } else {
		g1 = (pos4.Longitude - pos1.Longitude) / (pos4.Latitude - pos1.Latitude);
		g2 = (pos4.Longitude - pos3.Longitude) / (pos4.Latitude - pos3.Latitude);
		maxL = (rnCoord.Latitude - pos4.Latitude) * g1;
		minL = (rnCoord.Latitude - pos4.Latitude) * g2;
	    }
	    rnCoord.Longitude = rnd.Next((int)Math.Ceiling(minL), (int)Math.Floor(maxL));
	    return rnCoord;
}


