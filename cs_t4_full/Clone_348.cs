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
      HitShots.Insert(shot);
      MissCount = 0;
      EndPoints[1] = shot;
      if (EndPoints[0] == null) {
        EndPoints[0] = shot;
      }
      if (sunk) {
        for (int i=0; i<EndPoints.length; i++) {
          EndPoints[i].X = 0;
          EndPoints[i].Y = 0;
        }
      }
}


