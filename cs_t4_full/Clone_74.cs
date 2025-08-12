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


 private bool Matches(object expectedVal, object actualVal)
{
    bool matches = true;

    if(!MatchesNull(expectedVal,actualVal,ref matches))
        return matches;

    Constraint datesEqualConstraint = new DatesEqualConstraint(expectedVal).Within(tolerance ?? _regionalTolerance);
    if(datesEqualConstraint.Matches(actualVal))
        return true;

    if(!MatchesVisited(expectedVal,actualVal,ref matches))
        return matches;

    if(!MatchesDictionary(expectedVal,actualVal,ref matches))
        return matches;

    if(!MatchesList(expectedVal,actualVal,ref matches))
        return matches;

    if(!MatchesType(expectedVal,actualVal,ref matches))
        return matches;

    if(!MatchesPredicate(expectedVal,actualVal,ref matches))
        return matches;

    return MatchesFields(expectedVal,actualVal,datesEqualConstraint,ref matches);
}


