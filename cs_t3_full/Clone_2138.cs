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
        timecountdown = Mathf.Max(0f, timecountdown - Time.deltaTime);
        if (timecountdown == 0f) {
            timecountdown = 8f;
            teleport = 1;
            triggerActive = false;
        }
    } else {
        timecountdown = 8f;
        teleport = 0;
    }
}


