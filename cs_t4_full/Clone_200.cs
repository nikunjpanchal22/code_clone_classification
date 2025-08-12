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
          CronDaemon cron_daemon = CreateCronDaemon();
          cron_daemon.AddJobs(BuildCronJobList());
          cron_daemon.Start();

            while (true)
            {
              Thread.Sleep(6000);
            }
        }

        public static CronDaemon CreateCronDaemon()
        {
          return new CronDaemon();
        }

        public static List<CronJob> BuildCronJobList()
        {
          return new List<CronJob>
          {
            new CronJob("* * * * *", Sendmail),
            new CronJob("* * * * *", Downloadfile),
            new CronJob("* * * * *", ProcessFile),
            new CronJob("* * * * *", ExportFIle)
          };
}


