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
    string[] fileNames = new string[] { "{0:yyyyMMdd}----0001D.dat", "{0:yyyyMMdd}----4444D.dat" };
    DateTime dateStart = new DateTime(year, month, 1);
    DateTime dateEnd = dateStart.AddMonths(1);
    var reportList = new List<ReportFile>();

    for (DateTime date = dateStart; date < dateEnd; date = date.AddDays(1))
    {
        foreach (string fileTemplate in fileNames)
        {
            string filePath = string.Format(fileTemplate, date);
            if (File.Exists(filePath))
            {
                reportList.Add(new ReportFile { Date = date, Path = filePath, Lines = GetReportLines(filePath) });
            }
        }
    }

    return reportList;
}


