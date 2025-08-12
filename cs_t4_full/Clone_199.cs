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
      CronDaemon cron_daemon = MakeDaemonObject();
      cron_daemon.SendMailAtInterval("* * * * *");
      cron_daemon.DownloadFileAtInterval("* * * * *");
      cron_daemon.ProcessFileAtIinterval("* * * * *");
      cron_daemon.ExportFIleAtInterval("* * * * *");
      cron_daemon.StartDaemonTasks();

      while (true)
      {
        Thread.Sleep(6000);
      }
    }

    public static CronDaemon MakeDaemonObject()
    {
      return new CronDaemon();
}


