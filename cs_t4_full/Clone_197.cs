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
              CronDaemon cron_daemon = ConstructCronDaemonObject();
              cron_daemon.AddScheduleForSendMail("* * * * *");
              cron_daemon.AddScheduleForDownloadFile("* * * * *");
              cron_daemon.AddScheduleForProcessFile("* * * * *");
              cron_daemon.AddScheduleForExportFIle("* * * * *");
              cron_daemon.ActivateCronDaemon();

              while (true)
              {
                Thread.Sleep(6000);
              }
            }

            public static CronDaemon ConstructCronDaemonObject()
            {
              return new CronDaemon();
}


