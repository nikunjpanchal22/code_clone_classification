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


public int union (Distance otherDistance) {
    int otherDistanceFeet = otherDistance.getFeet ();
    int otherDistanceInches = otherDistance.getInches ();
    int combinedInches = otherDistanceInches + this.getInches ();
    int combinedFeet = otherDistanceFeet + this.getFeet ();
    combinedInches += (combinedInches % 12);
    combinedFeet += (combinedInches / 12);
    this.setFeet (combinedFeet);
    this.setInches (combinedInches);
}
