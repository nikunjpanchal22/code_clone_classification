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
       Impact.Add(shot);
    MissStat = 0;
    Bound[1] = shot;
    if(Bound[0] == null) 
        Bound[0] = shot;
    if(sunk)
        CutObjective();
}
