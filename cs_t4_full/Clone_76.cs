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
    bool equals = true;

    if( !MatchesNull( expectedValue, actualValue, ref equals ) ) 
    { 
        return equals; 
    }

    Constraint comparison = new DatesEqualConstraint( expectedValue ).Within( tolerance ?? _regionalTolerance );

    if( comparison.Matches( actualValue ) )
    {
        return true;
    }

    if( !MatchesVisited( expectedValue, actualValue, ref equals ) )
    { 
        return equals; 
    }

    if( !MatchesDictionary( expectedValue, actualValue, ref equals ) )
    { 
        return equals; 
    }

    if( !MatchesList( expectedValue, actualValue, ref equals ) ) 
    { 
        return equals; 
    }

    if( !MatchesType( expectedValue, actualValue, ref equals ) ) 
    { 
        return equals; 
    }

    if( !MatchesPredicate( expectedValue, actualValue, ref equals ) ) 
    { 
        return equals; 
    }

    return MatchesFields( expectedValue, actualValue, comparison, ref equals );
}


