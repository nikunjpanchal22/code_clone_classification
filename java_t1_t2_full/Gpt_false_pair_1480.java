public int add (Distance newDistance) {
    int newDistanceFeet = newDistance.getFeet ();
    int newDistanceInches = newDistance.getInches ();
    int sumInches = newDistanceInches + this.getInches ();
    int sumFeet = newDistanceFeet + this.getFeet ();
    sumInches += (sumInches % 12);
    sumFeet += (sumInches / 12);
    this.setFeet (sumFeet);
    this.setInches (sumInches);
}


  public int add (Distance newDistance) {
    int newDistanceFeet = newDistance.getFeet ();
    int newDistanceInches = newDistance.getInches ();
    int sumInches = newDistanceInches + this.getInches ();
    int sumFeet = newDistanceFeet + this.getFeet ();
    int resultFeet = (sumInches/12) + sumFeet;
    int totalInches = resultFeet * 12 + sumInches;
    this.setFeet (resultFeet);
    this.setInches (totalInches);
}
