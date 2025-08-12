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


 protected Dictionary<DateTime, String> getDateRange(String lowerDate, String higherDate, String frequency){
    DateTime startDate, endDate;
    startDate = Convert.ToDateTime(lowerDate);
    endDate = Convert.ToDateTime(higherDate);
    Dictionary<DateTime, String> returnDict = new Dictionary<DateTime, String>();
    DateTime tempDate = startDate;
    
    while (startDate < endDate)
    {
        if(frequency.Equals("weekly"))
        {
            tempDate = startDate.AddDays(7);    
            returnDict.Add(startDate, startDate.ToShortDateString() + " - " + tempDate.ToShortDateString());
            startDate = tempDate.AddDays(1);
        }
        else if(frequency.Equals("monthly"))
        {
            tempDate = startDate.AddMonths(1);
            returnDict.Add(startDate, startDate.ToShortDateString() + " - " + tempDate.ToShortDateString());
            startDate = tempDate.AddDays(1);
        }
    }

    if (startDate == endDate)
    {
        returnDict.Add( startDate, startDate.ToShortDateString() + " - " + endDate.ToShortDateString());
    }
    return returnDict;   
}


