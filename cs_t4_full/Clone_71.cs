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


 private bool Matches( object expectedValue, object actualValue )
{
    bool equal = true;
    if (expectedValue is null || actualValue is null)
    {
        return false;
    }

    DateEqualConstraint constraint = new DateEqualConstraint(expectedValue).Within(tolerance ?? _regionalTolerance);
    if (constraint.Matches(actualValue))
    {
        return true;
    }

    if (!MatchesVisited(expectedValue, actualValue, ref equal))
    {
        return equal;
    }

    if (!MatchesDictionary(expectedValue, actualValue, ref equal))
    {
        return equal;
    }

    if (!MatchesList(expectedValue, actualValue, ref equal))
    {
        return equal;
    }

    if (!MatchesType(expectedValue, actualValue, ref equal))
    {
        return equal;
    }

    if (!MatchesPredicate(expectedValue, actualValue, ref equal))
    {
        return equal;
    }

    return MatchesFields(expectedValue, actualValue, constraint, ref equal);
}


