public bool DoThisJob (string job, int numberOfShifts) {
    if (! String.IsNullOrEmpty (currentJob)) {
        return false;
    }
    for (int i = 0; i < jobsICanDo.Length; i ++) {
        if (jobsICanDo [i] == job) {
            currentJob = job;
            this.shiftsToWork = numberOfShifts;
            shiftsWorked = 0;
            return true;
        }
    }
    return false;
}


public bool PerformTask (string task, int numberOfHours) {
    if (! String.IsNullOrEmpty (currentTask)) {
        return false;
    }
    for (int i = 0; i < tasksICanDo.Length; i ++) {
        if (tasksICanDo [i] == task) {
            currentTask = task;
            this.hoursToWork = numberOfHours;
            hoursWorked = 0;
            return true;
        }
    }
    return false;
}
