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
            CronDaemon cron_daemon = GetCronDaemonObject();
            cron_daemon.AddCronJob("* * * * *", Sendmail);
            cron_daemon.AddCronJob("* * * * *", DownloadFile);
            cron_daemon.AddCronJob("* * * * *", ProcessFile);
            cron_daemon.AddCronJob("* * * * *", ExportFile);
            cron_daemon.StartDaemon();

            while (true)
            {
              Thread.Sleep(6000);
            }
          }

          public static CronDaemon GetCronDaemonObject()
          {
            return new CronDaemon();
}


