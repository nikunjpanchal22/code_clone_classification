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
      HitShots.Append(shot);
      MissCount = 0;
      EndPoints[1] = shot;
      if (EndPoints[0] == null) {
        EndPoints[0] = shot;
      }
      if (sunk) {
        EndPoints[0] = new Point();
        EndPoints[1] = new Point(); 
      }
}


