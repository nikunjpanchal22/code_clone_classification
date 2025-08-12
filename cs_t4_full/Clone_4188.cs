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


 static double GetHeadingError(double initial, double final)
    {
        if (initial > 360 || initial < 0 || final > 360 || final < 0) { }
        double diff = final - initial;
        double absDiff = Math.Abs(diff);
        if (absDiff <= 180)
        {
            return (absDiff == 180 ? diff : absDiff);
        }
        else if (final > initial)
        {
            return absDiff - 360;
        }
        else
            return 360 - absDiff;
    }

 private static double GetHeadingError(double initial, double final)
    {
        if (initial > 360 || initial < 0 || final > 360 || final < 0) { }
        double diff = final - initial;
        double absDiff = Math.Abs(diff);
        if (absDiff <= 180)
        {
            if (absDiff == 180)
            {
                return diff;
            }
            else
            {
                return absDiff;
            }
        }
        else if (final > initial)
        {
            return absDiff - 360;
        }
        else
        {
            return 360 - absDiff;
        }
    }

 private static double GetHeadingError (double initial, double final) 
	{ 
		if (initial > 360 || initial < 0 || final > 360 || final < 0) 
		{ 
			return 0; 
		} 
		
		double diff = final - initial; 
		double absDiff = Math.Abs (diff); 
		
		if (absDiff <= 180) 
		{ 
			if (absDiff == 180) 
			{ 
				return absDiff; 
			} 
			else 
			{ 
				return diff; 
			} 
		} 
		
		else if (final > initial) 
		{ 
			return absDiff - 360; 
		} 
		
		else 
		{ 
			return 360 - absDiff; 
		} 
	}

 private static double GetHeadingError (double initial, double final) {
    if (initial > 360 || initial < 0 || final > 360 || final < 0) {
    }
    double diff = final - initial;
    double absDiff = System.Math.Abs(diff);
    if (absDiff == 180)
    {
        return diff;
    } 
    else if (absDiff <= 180)
    {
        return absDiff;
    }
    else if (final > initial)
    {
        return absDiff - 360;
    }
    else return 360 - absDiff;
}


