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
    Strikes.Add(shot);
    MissedAttempt = 0;
    Edges[1] = shot;
    if(Edges[0] == null) 
        Edges[0] = shot;
    if(sunk)
        ExhaustTarget();
}
