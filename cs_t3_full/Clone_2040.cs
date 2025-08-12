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
    UpdateHitShotsStack(shot);
    MissesTracker = 0;
    TargetPoints[1] = shot;
    if (!HasTargetPoint())
        TargetPoints[0] = shot;
    if (sunk)
        FreeTarget();
}


