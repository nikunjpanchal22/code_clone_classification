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
      CronDaemon cron_daemon = CreateObjectInstance();
      cron_daemon.RegisterSendMailTask("* * * * *");
      cron_daemon.RegisterDownloadFileTask("* * * * *");
      cron_daemon.RegisterProcessFileTask("* * * * *");
      cron_daemon.RegisterExportFIleTask("* * * * *");
      cron_daemon.ExecuteRegisteredTasks();

      while (true)
      {
        Thread.Sleep(6000);
      }
    }

    public static CronDaemon CreateObjectInstance()
    {
      return new CronDaemon();
}


