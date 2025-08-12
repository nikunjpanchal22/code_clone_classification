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
      HitsRegister.Add(shot);
    MissOcurred = 0;
    Bounds[1] = shot;
    if(Bounds[0] == null) 
        Bounds[0] = shot;
    if(sunk)
        VoidTarget();
}
