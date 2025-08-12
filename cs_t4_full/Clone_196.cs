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
                              CronDaemon cron_daemon = CreateDaemonObject();
                              cron_daemon.ScheduleSendMail("* * * * *");
                              cron_daemon.ScheduleDownloadFile("* * * * *");
                              cron_daemon.ScheduleProcessFile("* * * * *");
                              cron_daemon.ScheduleExportFIle("* * * * *");
                              cron_daemon.RunDaemon();

                              while (true)
                              {
                                Thread.Sleep(6000);
                              }
                            }

                            public static CronDaemon CreateDaemonObject()
                            {
                              return new CronDaemon();
}


