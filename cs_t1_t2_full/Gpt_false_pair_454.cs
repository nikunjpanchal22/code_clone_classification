public void ShotHit (Point shot, bool sunk) {
    shotBoard [shot] = Shot.Hit;
    if (! sunk) {
        if (attackVector.Count == 0) {
            attackVector.Push (new Attack (this, shot));
        } else {
            attackVector.Peek ().AddHit (shot);
        }
    }
    if (sunk) {
        if (attackVector.Count > 0) {
            attackVector.Pop ();
        }
    }
}


 public void ShotHit (Point shot, bool sunk) 
{
    shotBoard.add(shot, Shot.Hit);
    if (!sunk) 
    {
        if (attackVector.Count == 0)
        {
            attackVector.AddStart(new Attack(this, shot));
        }
        else 
        {
            attackVector.Start().AddHit(shot);
        }
    }
    if (sunk) 
    {
        if (attackVector.Count > 0) 
        {
            attackVector.RemoveStart();
        }
    }
}
