public Point GetShot () {
    Point p = new Point ();
    if (attackVector.Count () > 0) {
        p = ExtendShot ();
        return p;
    }
    Board potential = new Board (size);
    for (p.Y = 0; p.Y < size.Height; ++ p.Y) {
        for (p.X = 0; p.X < size.Width; ++ p.X) {
            if (shotBoard.ShotAt (p)) {
                potential [p] = 0;
                continue;
            }
            foreach (HunterBoard b in targetBoards) {
                potential [p] += b.GetWeightAt (p);
            }
        }
    }
    Point shot;
    shot = potential.GetWeightedRandom (rand.NextDouble ());
    shotBoard [shot] = Shot.Unresolved;
    return shot;
}





public Point GetShot () {
    if (AttackInProgress()) {
        return ExtendShot ();
    }
    return ChooseRandomShot ();
}


