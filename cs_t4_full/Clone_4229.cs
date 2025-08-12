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
    if (attackVector.Count > 0) {
        Attack lastAttack = attackVector.Peek();
        if (sunk) {
            attackVector.Pop ();
        }
        else {
        lastAttack.AddHit(shot);
        }
    } else {
        attackVector.Push (new Attack (this, shot));
    }
}


