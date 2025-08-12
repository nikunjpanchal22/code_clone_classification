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
    if (expected == actual) 
        return true;

    if (expected == null || actual == null) 
        return false;

    if (expected is DateTime && actual is DateTime)
        return Math.Abs(((DateTime)expected - (DateTime)actual).TotalSeconds) <= _regionalTolerance.TotalSeconds;

    if (expected is IDictionary && actual is IDictionary)
        return DictionariesMatch((IDictionary)expected, (IDictionary)actual);

    if (expected is IList && actual is IList)
        return ListsMatch((IList)expected, (IList)actual);

    if (expected.GetType() != actual.GetType())
        return false;

    if (expected is IPredicate && actual is IPredicate)
        return ((IPredicate)expected).Invoke(actual);

    return FieldsMatch(expected, actual);
}


