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
    bool result = true;
    
    if (!MatchesNull(expected, actual, ref result)) 
        return result;

    Constraint dateEqualConstraint = new DatesEqualConstraint(expected).Within(tolerance ?? _regionalTolerance);

    if (dateEqualConstraint.Matches(actual)) 
        return true;

    if (!MatchesVisited(expected, actual, ref result)) 
        return result;
    
    if (!MatchesDictionary(expected, actual, ref result)) 
        return result;       
       
    if (!MatchesList(expected, actual, ref result)) 
        return result;

    if (!MatchesType(expected, actual, ref result)) 
        return result;

    if (!MatchesPredicate(expected, actual, ref result))
        return result;

    return MatchesFields(expected, actual, dateEqualConstraint, ref result);
}


