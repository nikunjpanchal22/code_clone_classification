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
    if (triggerActive) {
        timecountdown -= Time.deltaTime;
        teleport = (timecountdown <= 0.0f) ? 1 : teleport;
        timecountdown = (timecountdown <= 0.0f) ? 8.0f : timecountdown;
        triggerActive = (timecountdown <= 0.0f) ? false : triggerActive;
    } else {
        teleport = 0;
        timecountdown = 8.0f;
    }
}


