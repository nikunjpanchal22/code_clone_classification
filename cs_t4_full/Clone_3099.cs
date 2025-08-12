public static IList < ReportFile > ReadFiles (int year, int month) {
    string [] fileNames = new string [] {"{0:YYYYMMDD}----1234D.dat", "{0:YYYYMMDD}----5678D.dat"};
    DateTime dateStart = new DateTime (year, month, 1);
    DateTime dateEnd = dateStart.AddMonths (1);
    var reportList = new List < ReportFile > ();
    DateTime date = dateStart;
    while (date < dateEnd) {
        foreach (var fileTemplate in fileNames) {
            var file = string.Format (fileTemplate, date);
            if (File.Exists (file)) {
                var report = new ReportFile () {Date = date, Path = file, Lines = GetReportLines (file)};
                reportList.Add (report);
            }
        }
        date = date.AddDays (1);
    }
    return reportList;
}


 

public static IList<ReportFile> ReadFiles(int year, int month)
{
    return
        (from fileName in new string[] {"{0:yyyyMMdd}----1111D.dat", "{0:yyyyMMdd}----0000D.dat"}
         from date in Enumerable.Range(1, DateTime.DaysInMonth(year, month))
             .Select(m => new DateTime(year, month, m))
         let filePath = string.Format(fileName, date)
         where File.Exists(filePath)
         select new ReportFile {Date = date, Path = filePath, Lines = GetReportLines(filePath)}).ToList();
}


