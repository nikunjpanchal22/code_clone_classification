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
    shotBoard.put(shot, Shot.Hit);
    if (!sunk) 
    {
        if (attackVector.Count == 0)
        {
            attackVector.InsertTop(new Attack(this, shot));
        }
        else 
        {
            attackVector.Top().AddHit(shot);
        }
    }
    if (sunk) 
    {
        if (attackVector.Count > 0) 
        {
            attackVector.DeleteTop();
        }
    }
}
