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
    _timer.Stop();
    try {
        string logMessage = string.Format("Checking emails {0}", _count);
        _count++;
        EventLog.WriteEntry(Program.EventLogName, logMessage);
    }
    catch (Exception ex) {
        EventLog.WriteEntry(Program.EventLogName, "Exception: " + ex.Message);
    }
    _timer.Start();
}


