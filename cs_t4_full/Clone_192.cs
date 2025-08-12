static void Main (string [] args) {
    cron_daemon.add_job (new CronJob ("* * * * *", Sendmail));
    cron_daemon.add_job (new CronJob ("* * * * *", Downloadfile));
    cron_daemon.add_job (new CronJob ("* * * * *", ProcessFile));
    cron_daemon.add_job (new CronJob ("* * * * *", ExportFIle));
    cron_daemon.start ();
    while (true)
        Thread.Sleep (6000);
}


 static void Main(string[] args)
{
      CronDaemon cron_daemon = CreateObject();
      cron_daemon.DoSendMailAt("* * * * *");
      cron_daemon.DoDownloadFileAt("* * * * *");
      cron_daemon.DoProcessFileAt("* * * * *");
      cron_daemon.DoExportFIleAt("* * * * *");
      cron_daemon.RunSchedules();

      while (true)
      {
        Thread.Sleep(6000);
      }
    }

    public static CronDaemon CreateObject()
    {
      return new CronDaemon();
}


