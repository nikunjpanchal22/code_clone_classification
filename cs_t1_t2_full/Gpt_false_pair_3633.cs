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
    List < endpointEntry > pts = new List < endpointEntry > (2 * lines.Count);
    foreach (Line2D lin in lines) {
        endpointEntry high, low;
        if (lin.P1.X < lin.P2.X) {
            high = new endpointEntry () {XValue = lin.P2.X, isHigh = true, line = lin, upperVal = lin.P2.X, lowerVal = lin.P1.X};
            low = new endpointEntry () {XValue = lin.P1.X, isHigh = false, line = lin, upperVal = lin.P1.X, lowerVal = lin.P2.X};
        } else {
            high = new endpointEntry () {XValue = lin.P1.X, isHigh = true, line = lin, upperVal = lin.P1.X, lowerVal = lin.P2.X};
            low = new endpointEntry () {XValue = lin.P2.X, isHigh = false, line = lin, upperVal = lin.P2.X, lowerVal = lin.P1.X};
        }
        pts.Add (high);
        pts.Add (low);
    }
    pts.Sort (new endpointSorter ());
    endpointEntry existing = null;
    foreach (endpointEntry pt in pts) {
        if (existing != null) {
            pt.beforeLink = existing;
            existing.afterLink = pt;
        }
        existing = pt;
    }
    foreach (endpointEntry pt in pts) {
        if (pt.isHigh) {
            for (endpointEntry pLow = pt.afterLink; (pLow != null) && (pLow.XValue >= pt.lowerVal); pLow = pLow.afterLink) {
                if (! pLow.isHigh) {
                    if (pt.line.intersectsLine (pLow.line))
                        return true;
                }
            }
        }
    }
    return false;
}
