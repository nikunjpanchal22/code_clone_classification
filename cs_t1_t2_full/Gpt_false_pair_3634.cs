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
    // Collect all end point entries in a list
    List < endpointEntry > pts = new List < endpointEntry > (2 * lines.Count);
    foreach (Line2D lin in lines) {
        endpointEntry hi, lo;
        // Check the X values
        if (lin.P1.X < lin.P2.X) {
            // Build the hi entry
            hi = new endpointEntry () {XValue = lin.P2.X, isHi = true, line = lin, hi = lin.P2.X, lo = lin.P1.X};
            // Build the lo entry
            lo = new endpointEntry () {XValue = lin.P1.X, isHi = false, line = lin, hi = lin.P1.X, lo = lin.P2.X};
        } else {
            // Build the hi entry
            hi = new endpointEntry () {XValue = lin.P1.X, isHi = true, line = lin, hi = lin.P1.X, lo = lin.P2.X};
            // Build the lo entry
            lo = new endpointEntry () {XValue = lin.P2.X, isHi = false, line = lin, hi = lin.P2.X, lo = lin.P1.X};
        }
        // Add the entries to the list
        pts.Add (hi);
        pts.Add (lo);
    }
    // Sort the list
    pts.Sort (new endpointSorter ());
    // Initialize the previous entry
    endpointEntry prev = null;
    // Link the items
    foreach (endpointEntry pt in pts) {
        if (prev != null) {
            // Link the pointers
            pt.bLink = prev;
            prev.fLink = pt;
        }
        // Set the previous for the next iteration
        prev = pt;
    }
    // Iterate all items
    foreach (endpointEntry pt in pts) {
        // Check if the current is high
        if (pt.isHi) {
            // Iterate all lower values
            for (endpointEntry pLo = pt.fLink; (pLo != null) && (pLo.XValue >= pt.lo); pLo = pLo.fLink) {
                // Check if the current lower is low
                if (! pLo.isHi) {
                    // Check for intersection
                    if (pt.line.intersectsLine (pLo.line))
                        return true;
                }
            }
        }
    }
    // No intersection
    return false;
}
