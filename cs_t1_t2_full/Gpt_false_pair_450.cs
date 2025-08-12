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
      Bullets.Add(shot);
    Miss = 0;
    Points[1] = shot;
    if(Points[0] == null) 
        Points[0] = shot;
    if(sunk)
        UnsetTarget();
}
