public bool CheckForCrossing (List < Line2D > lines) {
    List < endpointEntry > pts = new List < endpointEntry > (2 * lines.Count);
    foreach (Line2D lin in lines) {
        endpointEntry hi, lo;
        if (lin.P1.X < lin.P2.X) {
            hi = new endpointEntry () {XValue = lin.P2.X, isHi = true, line = lin, hi = lin.P2.X, lo = lin.P1.X};
            lo = new endpointEntry () {XValue = lin.P1.X, isHi = false, line = lin, hi = lin.P1.X, lo = lin.P2.X};
        } else {
            hi = new endpointEntry () {XValue = lin.P1.X, isHi = true, line = lin, hi = lin.P1.X, lo = lin.P2.X};
            lo = new endpointEntry () {XValue = lin.P2.X, isHi = false, line = lin, hi = lin.P2.X, lo = lin.P1.X};
        }
        pts.Add (hi);
        pts.Add (lo);
    }
    pts.Sort (new endpointSorter ());
    endpointEntry prev = null;
    foreach (endpointEntry pt in pts) {
        if (prev != null) {
            pt.bLink = prev;
            prev.fLink = pt;
        }
        prev = pt;
    }
    foreach (endpointEntry pt in pts) {
        if (pt.isHi) {
            for (endpointEntry pLo = pt.fLink; (pLo != null) && (pLo.XValue >= pt.lo); pLo = pLo.fLink) {
                if (! pLo.isHi) {
                    if (pt.line.intersectsLine (pLo.line))
                        return true;
                }
            }
        }
    }
    return false;
}


public bool CheckForCrossing (List < Line2D > lines) {
    List < endpointEntry > points = new List < endpointEntry > (2 * lines.Count);
    foreach (Line2D line in lines) {
        endpointEntry top, bottom;
        if (line.P1.X < line.P2.X) {
            top = new endpointEntry () {XValue = line.P2.X, isMax = true, line = line, highVal = line.P2.X, lowVal = line.P1.X};
            bottom = new endpointEntry () {XValue = line.P1.X, isMax = false, line = line, highVal = line.P1.X, lowVal = line.P2.X};
        } else {
            top = new endpointEntry () {XValue = line.P1.X, isMax = true, line = line, highVal = line.P1.X, lowVal = line.P2.X};
            bottom = new endpointEntry () {XValue = line.P2.X, isMax = false, line = line, highVal = line.P2.X, lowVal = line.P1.X};
        }
        points.Add (top);
        points.Add (bottom);
    }
    points.Sort (new endpointSorter ());
    endpointEntry prior = null;
    foreach (endpointEntry pt in points) {
        if (prior != null) {
            pt.previousLink = prior;
            prior.nextLink = pt;
        }
        prior = pt;
    }
    foreach (endpointEntry pt in points) {
        if (pt.isMax) {
            for (endpointEntry pLow = pt.nextLink; (pLow != null) && (pLow.XValue >= pt.lowVal); pLow = pLow.nextLink) {
                if (! pLow.isMax) {
                    if (pt.line.intersectsLine (pLow.line))
                        return true;
                }
            }
        }
    }
    return false;
}
