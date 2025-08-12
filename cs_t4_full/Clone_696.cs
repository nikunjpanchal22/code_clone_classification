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


 public bool DoThisJob (string job, int numberOfShifts)
{
                if (String.IsNullOrEmpty(this.currentJob)) 
            {
                for (int i = 0; i < jobsICanDo.Length; i++)
                {
                    if (this.jobsICanDo[i].Equals(job))
                    {
                        this.currentJob = job;
                        this.shiftsToWork = numberOfShifts;
                        this.shiftsWorked = 0;
                        return true;
                    }
                }
            }
            return false;
}


