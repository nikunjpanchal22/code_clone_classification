public void ShotHit (Point shot, bool sunk) {
    HitShots.AddLast (shot);
    MissCount = 0;
    EndPoints [1] = shot;
    if (EndPoints [0] == null)
        EndPoints [0] = shot;
    if (sunk)
        NullOutTarget ();
}





public void ShotHit(Point shot, bool sunk) {
    HitShots.AddLast(shot);
    if(!sunk) return;
    missCount = 0;
    EndPoints[0] = EndPoints[0] ?? shot;
    EndPoints[1] = shot;
    NullOutTarget();
}


