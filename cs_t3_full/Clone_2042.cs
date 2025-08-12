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
    hitShotsQueue.Enqueue(shot);
    Misses = 0;
    endPointB = shot;
    if (endPointA == null)
        endPointA = shot;
    if (sunk)
        ClearTarget();
}


