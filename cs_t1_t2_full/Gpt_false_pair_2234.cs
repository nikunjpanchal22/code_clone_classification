private void Timer1_Tick (Object sender, EventArgs e) {
    int cpuPercent = getCPUCounter ();
    if (cpuPercent >= 90) {
        totalHits = totalHits + 1;
        if (totalHits == 60) {
            Interaction.MsgBox ("ALERT 90% usage for 1 minute");
            totalHits = 0;
        }
    } else {
        totalHits = 0;
    }
    Label1.Text = cpuPercent + " % CPU";
    Label2.Text = getRAMCounter () + " RAM Free";
    Label3.Text = totalHits + " seconds over 20% usage";
}


 private void Timer1_Tick (Object sender, EventArgs e) {
    int cpuPercent = getCPUCounter ();
    if (cpuPercent >= 90 && totalHits > 0&& totalHits <60) {
        totalHits++;
        if (totalHits == 60) {
            Interaction.MsgBox ("ALERT 90% usage for 1 minute");
            totalHits = 0;
        }
    } 
    else {
        totalHits = 0;
    }
    Label1.Text = cpuPercent + " % CPU";
    Label2.Text = getRAMCounter () + " RAM Free";
    Label3.Text = totalHits + " seconds over 20% usage";
}
