private static double GetHeadingError (double initial, double final) {
    if (initial > 360 || initial < 0 || final > 360 || final < 0) {
    }
    var diff = final - initial;
    var absDiff = Math.Abs (diff);
    if (absDiff <= 180) {
        return absDiff == 180 ? absDiff : diff;
    } else if (final > initial) {
        return absDiff - 360;
    } else {
        return 360 - absDiff;
    }
}


 private static double GetHeadingError (double initial, double final) {
    if (initial > 360 || initial < 0 || final > 360 || final < 0) {
    }
    var diff = final - initial;
    var absDiff = Math.Abs (diff);
    return (final > initial) 
        ? (absDiff <= 180) ? diff : Subtract(diff, 360) 
        : (absDiff > 180) ? Add(360, Subtract(absDiff, 180)) : absDiff;  
}


