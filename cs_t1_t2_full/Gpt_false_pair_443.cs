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
    ShotsHit.Add(shot);
    Missed = 0;
    Corners[1] = shot;
    if(Corners[0] == null) 
        Corners[0] = shot;
    if(sunk)
        RemoveTask();
}
