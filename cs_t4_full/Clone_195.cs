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
                CronDaemon cron_daemon = CreateCronDaemonObject();
                cron_daemon.AddJobForSendMail();
                cron_daemon.AddJobForDownloadFile();
                cron_daemon.AddJobForProcessFile();
                cron_daemon.AddJobForExportFIle();
                cron_daemon.StartCronDaemon();

                while (true)
                {
                  Thread.Sleep(6000);
                }
              }

              public static CronDaemon CreateCronDaemonObject()
              {
                return new CronDaemon();
}


