private bool Matches (object expectedValue, object actualValue) {
    bool matches = true;
    if (! MatchesNull (expectedValue, actualValue, ref matches)) {
        return matches;
    }
    Constraint eq = new DatesEqualConstraint (expectedValue).Within (tolerance ?? _regionalTolerance);
    if (eq.Matches (actualValue)) {
        return true;
    }
    if (MatchesVisited (expectedValue, actualValue, ref matches)) {
        if (MatchesDictionary (expectedValue, actualValue, ref matches) && MatchesList (expectedValue, actualValue, ref matches) && MatchesType (expectedValue, actualValue, ref matches) && MatchesPredicate (expectedValue, actualValue, ref matches)) {
            MatchesFields (expectedValue, actualValue, eq, ref matches);
        }
    }
    return matches;
}



private bool Matches (object expectedValue, object actualValue) {
    bool matches = false;

    if (MatchesNull (expectedValue, actualValue, ref matches)) {
        Constraint eq = new EqualsConstraint (expectedValue).Within (tolerance ?? _regionalTolerance);
        if (eq.Matches (actualValue) || MatchesVisited(expectedValue, actualValue, ref matches) || MatchesDictionary(expectedValue, actualValue, ref matches) || MatchesList(expectedValue, actualValue, ref matches) || MatchesType(expectedValue, actualValue, ref matches) || MatchesPredicate(expectedValue, actualValue, ref matches)) {
            matches = MatchesFields(expectedValue, actualValue, eq, ref matches);
        }
    }

    return matches; 
}


