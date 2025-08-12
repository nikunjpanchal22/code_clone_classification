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



private Coordinate CalculateV10 (Coordinate pnt1, Coordinate pnt2, Coordinate pnt3, Coordinate pnt4) {
	    Random rdm = new Random();
	    Coordinate calcCoord = new Coordinate(){Latitude = rdm.Next((int) pnt4.Latitude, (int) pnt2.Latitude)};
	    double slopeOne, slopeTwo, maxLon, minLon;
	    if (calcCoord.Latitude > pnt1.Latitude) {
		slopeOne = (pnt2.Longitude - pnt1.Longitude) / (pnt2.Latitude - pnt1.Latitude);
		slopeTwo= (pnt2.Longitude - pnt3.Longitude) / (pnt2.Latitude - pnt3.Latitude);
		maxLon = (calcCoord.Latitude - pnt2.Latitude) * slopeOne;
		minLon = (calcCoord.Latitude - pnt2.Latitude) * slopeTwo;
	    } else {
		slopeOne= (pnt4.Longitude - pnt1.Longitude) / (pnt4.Latitude - pnt1.Latitude);
		slopeTwo = (pnt4.Longitude - pnt3.Longitude) / (pnt4.Latitude - pnt3.Latitude);
		maxLon = (calcCoord.Latitude - pnt4.Latitude) * slopeOne;
		minLon = (calcCoord.Latitude - pnt4.Latitude) * slopeTwo;
	    }
	    calcCoord.Longitude = rdm.Next((int) Math.Ceiling(minLon), (int) Math.Floor(maxLon));
	    return calcCoord;
}


