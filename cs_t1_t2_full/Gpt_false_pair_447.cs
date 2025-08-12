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
      RegisterHit(shot);
    MissAttempts = 0;
    Limits[1] = shot;
    if(Limits[0] == null) 
        Limits[0] = shot;
    if(sunk)
        EndObjective();
}
