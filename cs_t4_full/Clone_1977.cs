protected static Dictionary < DateTime, String > getDateRange (String lowerDate, String higherDate, String frequency) {
    DateTime startDate, endDate;
    startDate = Convert.ToDateTime (lowerDate);
    endDate = Convert.ToDateTime (higherDate);
    Dictionary < DateTime, String > returnDict = new Dictionary < DateTime, String > ();
    while (frequency.Equals ("weekly") ? (startDate.AddDays (7) <= endDate) : (startDate.AddMonths (1) <= endDate)) {
        if (frequency.Equals ("weekly")) {
            returnDict.Add (startDate, startDate + "-" + startDate.AddDays (7));
            startDate = startDate.AddDays (8);
        }
        if (frequency.Equals ("monthly")) {
            returnDict.Add (startDate, startDate + "-" + startDate.AddMonths (1));
            startDate = startDate.AddMonths (1).AddDays (1);
        }
    }
    returnDict.Add (startDate, startDate + "-" + endDate);
    return returnDict;
}


 protected static Dictionary < DateTime, String > getDateRange (String lowerDate, String higherDate, String frequency) {
    DateTime startDate, endDate; 
    startDate = Convert.ToDateTime (lowerDate);
    endDate = Convert.ToDateTime (higherDate);
    
    Dictionary < DateTime, String > returnDict = new Dictionary < DateTime, String > ();
    DateTime currentStart;
    currentStart = startDate;
    int diff;
    
    while (startDate < endDate) {
      if (frequency.Equals("weekly")) {
        diff = (int) (endDate - startDate).TotalDays;
        if (diff <= 7) {
          returnDict.Add(startDate, startDate + "-" + endDate);
          return returnDict;
        } else {
          returnDict.Add(currentStart, currentStart + "-" + startDate.AddDays(7));
          startDate = startDate.AddDays(7);
          currentStart = startDate.AddDays(1);
        }
      } else if (frequency.Equals("monthly")) {
        returnDict.Add(currentStart, currentStart + "-" + startDate.AddMonths(1));
        startDate = startDate.AddMonths(1);
        currentStart = startDate.AddDays(1);
      } 
    }
    
    returnDict.Add(currentStart, currentStart + "-" + endDate);
    return returnDict;
}


