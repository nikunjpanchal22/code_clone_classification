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
    return Enumerable.Range(1, DateTime.DaysInMonth(year, month)).SelectMany(
        day => new[]{"{0:yyyyMMdd}----5555D.dat", "{0:yyyyMMdd}----6666D.dat"},
        (day, fileTemplate) =>
        {
            var date = new DateTime(year, month, day);
            var fileName = string.Format(fileTemplate, date);
            return File.Exists(fileName)
                ? new ReportFile { Date = date, Path = fileName, Lines = GetReportLines(fileName) }
                : null;
        }).Where(x => x!=null).ToList();
}


