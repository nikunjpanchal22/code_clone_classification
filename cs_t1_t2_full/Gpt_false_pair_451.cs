public void ShotHit (Point shot, bool sunk) {
    HitShots.AddLast (shot);
    MissCount = 0;
    EndPoints [1] = shot;
    if (EndPoints [0] == null)
        EndPoints [0] = shot;
    if (sunk)
        NullOutTarget ();
}


  public void ShotHit (Point shot, bool sunk) {
      ImpactMarks.Add(shot);
    MissesOccurred = 0;
    Extremities[1] = shot;
    if(Extremities[0] == null) 
        Extremities[0] = shot;
    if(sunk)
        EraseTarget();
}
