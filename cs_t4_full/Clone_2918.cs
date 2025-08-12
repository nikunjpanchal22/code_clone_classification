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





void Update(){
    if(!triggerActive) {
        teleport = 0;
        timecountdown = 8f;
    } else if( (timecountdown -= Time.deltaTime) <= 0) {
        teleport=1;
        timecountdown = 8f;
        triggerActive = false;
    }
}


