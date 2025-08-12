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
    List<DateTime> dateList = new List<DateTime>();
  
    if(frequency.Equals("weekly")){
        while(startDate.AddDays(7) <= endDate){
            dateList.Add(startDate);
            startDate = startDate.AddDays(8);
        }
    } else {
        while(startDate.AddMonths(1) <= endDate){
            dateList.Add(startDate);
            startDate = startDate.AddMonths(1).AddDays(1);
        }
    }
    
    for(int i = 0; i < dateList.Count; i++){
        if(i == dateList.Count - 1)
            returnDict.Add(dateList[i], dateList[i] + "-" + endDate);
        else
            returnDict.Add(dateList[i], dateList[i] + "-" + dateList[i + 1].AddDays(-1));
    }
    
    return returnDict;
}


