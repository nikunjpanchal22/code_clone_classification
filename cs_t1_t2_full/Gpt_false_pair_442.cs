public void ShotHit (Point shot, bool sunk) {
    HitShots.AddLast (shot);
    MissCount = 0;
    EndPoints [1] = shot;
    if (EndPoints [0] == null)
        EndPoints [0] = shot;
    if (sunk)
        NullOutTarget ();
}


  public void ShotHit (Point shot, bool sunk) {  Hits.Add(shot);
    Misses = 0;
    Boundaries[1] = shot;
    if(Boundaries[0] == null) 
        Boundaries[0] = shot;
    if(sunk) 
        RemoveTarget();
}
