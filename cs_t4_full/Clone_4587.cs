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


 
private Coordinate Calculate(Coordinate location1, Coordinate location2, Coordinate location3, Coordinate location4) {
    double maxLatitude = Math.max(location2.Latitude, location4.Latitude);
    double minLatitude = Math.min(location2.Latitude, location4.Latitude);
    double minLongitude;
    double maxLongitude;
    Random random = new Random();
    Coordinate randomCoordinate;

    do {
        randomCoordinate = new Coordinate(){Latitude = random.nextDouble() * (maxLatitude - minLatitude) + minLatitude};
    } while(randomCoordinate.Latitude < Math.min(location1.Latitude, location3.Latitude) || randomCoordinate.Latitude > Math.max(location1.Latitude, location3.Latitude));

    if (randomCoordinate.Latitude > location1.Latitude) {
        maxLongitude = (location2.Longitude - location1.Longitude) / (location2.Latitude - location1.Latitude);
        minLongitude = (location2.Longitude - location3.Longitude) / (location2.Latitude - location3.Latitude);
    } 
    else {
        maxLongitude = (location4.Longitude - location1.Longitude) / (location4.Latitude - location1.Latitude);
        minLongitude = (location4.Longitude - location3.Longitude) / (location4.Latitude - location3.Latitude);
    }
    randomCoordinate.Longitude = random.nextDouble() * (maxLongitude - minLongitude) + minLongitude; 
    return randomCoordinate;
}


