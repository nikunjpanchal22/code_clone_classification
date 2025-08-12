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
    int totalInches = sumInches + (sumFeet * 12);
    int sumFeet = totalInches / 12;
    int sumInches = totalInches % 12;
    this.setFeet (sumFeet);
    this.setInches (sumInches);
}


