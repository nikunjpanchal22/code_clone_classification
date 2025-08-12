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
    if (triggerActive && timecountdown > 0.0f) {
        timecountdown -= Time.deltaTime;
    } else {
        teleport = (triggerActive) ? 1 : 0;
        triggerActive = (triggerActive) ? false : triggerActive;
        timecountdown = 8.0f;
    }
}


