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
        if (timecountdown <= 0.0f) {
            timecountdown = 8.0f;
            teleport = 1;
            triggerActive = false;
        }
    }
    else {
        teleport = 0;
        timecountdown = Mathf.Clamp(timecountdown, 0.0f, 8.0f);
        if (timecountdown < 8f) {
            timecountdown += Time.deltaTime;
        }
    }
}


