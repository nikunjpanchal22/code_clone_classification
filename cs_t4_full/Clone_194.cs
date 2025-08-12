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
      CronDaemon cron_daemon = GetDaemonObject();
      cron_daemon.SetSendMailJobAt("* * * * *");
      cron_daemon.SetDownloadFileJobAt("* * * * *");
      cron_daemon.SetProcessFileJobAt("* * * * *");
      cron_daemon.SetExportFIleJobAt("* * * * *");
      cron_daemon.StartTimedJobs();

      while (true)
      {
        Thread.Sleep(6000);
      }
    }

    public static CronDaemon GetDaemonObject()
    {
      return new CronDaemon();
}


