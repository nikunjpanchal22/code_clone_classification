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


 private bool Matches(object expected, object actual)
{
    bool equal = true;

    if(!MatchesNull(expected, actual, ref equal))
        return equal;

    Constraint dateEqualConstraint = new DatesEqualConstraint(expected).Within(tolerance ?? _regionalTolerance);
    if (dateEqualConstraint.Matches(actual)) 
        return true;

    if(!MatchesVisited(expected, actual, ref equal))
        return equal;

    if(!MatchesDictionary(expected, actual, ref equal))
        return equal;

if(!MatchesList(expected, actual, ref equal)) 
        return equal;

    if(!MatchesType(expected, actual, ref equal)) 
        return equal;

    if(!MatchesPredicate(expected, actual, ref equal)) 
        return equal;
 
    return MatchesFields(expected, actual, dateEqualConstraint, ref equal);
}


