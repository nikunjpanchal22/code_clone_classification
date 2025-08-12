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
    if (!triggerActive) {
            teleport = 0;
            timecountdown = 8.0f;
    } else {
        timecountdown -= Time.deltaTime;
        if (timecountdown <= 0.0f) {
            timecountdown = 8.0f;
            teleport = 1;
            triggerActive = false;
        }
    }
}


