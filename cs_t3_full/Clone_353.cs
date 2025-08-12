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


 public Point GetShot()
{
    Point p = new Point();
    Board potential = new Board(size);
    double totalWeight = 0.0;

    if (attackVector.Count() > 0)
    {
        return ExtendShot();
    }
    
    // compute the weights
    for (p.Y = 0; p.Y < size.Height; ++ p.Y) 
    {
        for (p.X = 0; p.X < size.Width; ++ p.X) 
        {
            potential[p] = 0;
            if (!shotBoard.ShotAt(p))
            {
                foreach (HunterBoard b in targetBoards) 
                {
                    totalWeight += b.GetWeightAt(p); 
                }
                potential[p] = totalWeight;
            }
        }
    }

    //get weighted random point from board potential
    Point shot;
    shot = potential.GetWeightedRandom(rand.NextDouble());
    shotBoard[shot] = Shot.Unresolved;
    return shot;
}


