private void Interval (object sender, EventArgs e) {
    if (cbPause.Checked) {
        randomLine = random.Next (lbMessage.Items.Count);
        tmrSpace.Enabled = true;
        if (whenStart)
            tickCount ++;
        else
            whenStart = true;
    } else {
        if (cbRandomLine.Checked) {
            SendKeys.Send (lbMessage.Items [random.Next (lbMessage.Items.Count)].ToString () + "{enter}");
        } else {
            if (tickCount < lbMessage.Items.Count) {
                SendKeys.Send (lbMessage.Items [tickCount].ToString () + "{enter}");
                tickCount ++;
            }
        }
    }
    if (tickCount == lbMessage.Items.Count)
        tickCount = 0;
    SetInterval ();
}


private void Interval (object sender, EventArgs e) {
    // Determine if the 'Pause' checkbox is checked
    if (cbPause.Checked) {
        // Generate a random line
        randomLine = random.Next (lbMessage.Items.Count);
        // Enable the timer
        tmrSpace.Enabled = true;
        // Determine if the whenStart boolean has been updated
        if (whenStart)
            tickCount ++;
        else
            whenStart = true;
    } else {
        // Determine if the 'Random Line' checkbox is checked
        if (cbRandomLine.Checked) {
            // Generate a random message from the list
            SendKeys.Send (lbMessage.Items [random.Next (lbMessage.Items.Count)].ToString () + "{enter}");
        } else {
            // Determine if the tickCount is below the number of items in the list
            if (tickCount < lbMessage.Items.Count) {
                // Send a message from the list
                SendKeys.Send (lbMessage.Items [tickCount].ToString () + "{enter}");
                // Increment the tickCount
                tickCount ++;
            }
        }
    }
    // If the tickCount is equal to the number of items in the list
    if (tickCount == lbMessage.Items.Count)
        // Reset the tickCount
        tickCount = 0;
    // Call the SetInterval function
    SetInterval ();
}
