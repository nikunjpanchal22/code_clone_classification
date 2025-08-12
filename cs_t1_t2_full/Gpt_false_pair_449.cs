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
      Shots.Add(shot);
    MissCounts = 0;
    Locations[1] = shot;
    if(Locations[0] == null) 
        Locations[0] = shot;
    if(sunk)
        TerminateObjective();
}
