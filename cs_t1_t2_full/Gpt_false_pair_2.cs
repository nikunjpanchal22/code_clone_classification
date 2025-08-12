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
    CronDaemon cron_daemon = new CronDaemon();
    cron_daemon.AddJob(new CronJob("* * * * *", Sendmail));
    cron_daemon.AddJob(new CronJob("* * * * *", DownloadFile));
    cron_daemon.AddJob(new CronJob("* * * * *", ProcessFile));
    cron_daemon.AddJob(new CronJob("* * * * *", ExportFile));
    cron_daemon.Start();

    while (true)
    {
      Thread.Sleep(6000);
          }
}
