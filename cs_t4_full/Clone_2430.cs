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
    if(!sunk) MissCount = 0;
    HitShots.AddLast(shot);
    if(sunk) {
        NullOutTarget();
        if (EndPoints[0] == null) { 
            EndPoints[0] = shot;
        }
    } else {
        EndPoints[1] = shot;
    }
}


