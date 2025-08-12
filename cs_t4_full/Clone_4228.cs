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


 public void ShotHit (Point shot, bool sunk) {
    shotBoard [shot] = Shot.Hit;
    if (sunk) {
        if (attackVector.Count > 0) {
            attackVector.Pop ();
        }
    } 
    else {
        if (attackVector.Count == 0) {
            attackVector.Push (new Attack (this, shot));
        } 
        else {
            Attack lastAttack = attackVector.Peek();
            lastAttack.AddHit(shot);
        }
    }
}


