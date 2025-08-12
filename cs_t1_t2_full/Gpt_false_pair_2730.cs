static void Main (string [] args) {
    cron_daemon.add_job (new CronJob ("* * * * *", Sendmail));
    cron_daemon.add_job (new CronJob ("* * * * *", Downloadfile));
    cron_daemon.add_job (new CronJob ("* * * * *", ProcessFile));
    cron_daemon.add_job (new CronJob ("* * * * *", ExportFIle));
    cron_daemon.start ();
    while (true)
        Thread.Sleep (6000);
}


static void Main (string [] args) {
    cron_daemon.add_job (new CronJob ("0 0 0 0 0", Sendmail));
    cron_daemon.add_job (new CronJob ("0 0 0 0 0", Downloadfile));
    cron_daemon.add_job (new CronJob ("0 0 0 0 0", ProcessFile));
    cron_daemon.add_job (new CronJob ("* * * * *", ExportFIle));
    cron_daemon.start ();
    while (true)
        Thread.Sleep (7000);
}
