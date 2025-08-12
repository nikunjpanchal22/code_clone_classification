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
      HitShots.InsertLast(shot);
      MissCount = 0;
      EndPoints[1] = shot;
      if (EndPoints[0] == null) {
        EndPoints[0] = shot;
      }
      if (sunk) {
        EndPoints = new Point[2];
        EndPoints[0].X = 0;
        EndPoints[0].Y = 0;
        EndPoints[1].X = 0;
        EndPoints[1].Y = 0;
      }
}


