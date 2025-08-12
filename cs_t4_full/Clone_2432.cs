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
    if (HitShots != null) { HitShots.AddLast(shot); } 
    MissCount = sunk ? MissCount : 0; 
    EndPoints[1] = (EndPoints[1] != null) ? EndPoints[1] : shot; 
    if (EndPoints[0] == null) { EndPoints[0] = shot; }
    if (sunk) { NullOutTarget(); }
}


