void Update () {
    if (triggerActive) {
        timecountdown -= Time.deltaTime;
        if (timecountdown <= 0.0f) {
            timecountdown = 8.0f;
            teleport = 1;
            triggerActive = false;
        }
    } else {
        teleport = 0;
        timecountdown = 8.0f;
    }
}





void Update () {
    timecountdown = (!triggerActive || timecountdown <= 0f) ? 8f : timecountdown - Time.deltaTime;
    teleport = (!triggerActive || timecountdown <= 0f) ? 0 : 1;
    triggerActive = (!triggerActive || timecountdown <= 0f) ? false : true;
}


