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
    InsertHit(shot);
    ClearMisses();
    SetHitEnd(shot);
    if (NoHitStart())
        SetHitStart(shot);
    if (sunk)
        CleanTarget();
}


