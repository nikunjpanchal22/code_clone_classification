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
    string[] fileNames = new string[] { "{0:yyyyMMdd}-2222D.dat", "{0:yyyyMMdd}-3333D.dat" };
    List<ReportFile> reportList = new List<ReportFile>();
    int daysInMonth = DateTime.DaysInMonth(year, month);

    for (int day = 1; day <= daysInMonth; day++)
    {
        DateTime date = new DateTime(year, month, day);
        foreach (string fileTemplate in fileNames)
        {
            string file = string.Format(fileTemplate, date);
            if (File.Exists(file))
            {
                reportList.Add(new ReportFile { Date = date, Path = file, Lines = GetReportLines(file) });
            }
        }
    }

    return reportList;
}


