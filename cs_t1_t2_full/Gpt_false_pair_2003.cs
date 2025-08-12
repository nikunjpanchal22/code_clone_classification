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
    //If the 'Pause' checkbox is checked
    if (cbPause.Checked) {
        // Generate a random line
        randomLine = random.Next (lbMessage.Items.Count);
        // Set the timer to enabled
        tmrSpace.Enabled = true;

        // Check if the whenStart boolean has been updated
        if (whenStart)
            tickCount ++;
        // Otherwise
        else
            whenStart = true;
    } else {
        // Check if the 'Random Line' checkbox is checked
        if (cbRandomLine.Checked) {
            // Generate a message from the list
            SendKeys.Send (lbMessage.Items [random.Next (lbMessage.Items.Count)].ToString () + "{enter}");
        // Otherwise
        } else {
            // Determine if the tickCount has reached the number of items in the list
            if (tickCount < lbMessage.Items.Count) {
                // Send a message from the list
                SendKeys.Send (lbMessage.Items [tickCount].ToString () + "{enter}");
                // Increment the tickCount
                tickCount ++;
            }
        }
    }
    // If the tickCount reaches the number of items in the list
    if (tickCount == lbMessage.Items.Count)
        // Set the tickCount to 0
        tickCount = 0;
    // Call the SetInterval function
    SetInterval ();
}
