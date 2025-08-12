private void timer_Elapsed (object sender, System.Timers.ElapsedEventArgs e) {
    _timer.Stop ();
    try {
        EventLog.WriteEntry (Program.EventLogName, "Checking emails " + _count ++);
    }
    catch (Exception ex) {
        EventLog.WriteEntry (Program.EventLogName, "This is my error " + ex.Message);
    }
    _timer.Start ();
}


private void timer_Elapsed (object sender, System.Timers.ElapsedEventArgs e) {
    _timer.Stop ();
    try {
        EventLog.WriteEntry (Program.EventLogName, "Checking network " + _count ++);
    }
    catch (Exception ex) {
        EventLog.WriteEntry (Program.EventLogName, "This is my issue " + ex.Message);
    }
    _timer.Start ();
}
