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
    StoreHitShot(shot);
    ResetMissTracker();
    UpdateShotEnd(shot);
    if (HasNullShotStart())
        UpdateShotStart(shot);
    if (sunk)
        ReleaseTarget();
}


