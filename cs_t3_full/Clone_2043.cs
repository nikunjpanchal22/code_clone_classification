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
    var endPoints = new List<Point> {shot};
    HitShots.AddRange(endPoints);
    MissCount = 0;
    EndPoints[2] = shot;
    if (EndPoints[0] == null) { EndPoints[1] = shot; }
    if (sunk){ NullOutTarget(); }
}


