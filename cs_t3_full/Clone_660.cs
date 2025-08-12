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
                if (String.IsNullOrEmpty(currentJob))
                {
                    bool returnValue = false; 
                    for (int i = 0; i < jobsICanDo.Length; i++)
                    {
                        if (jobsICanDo[i].Equals(job))
                        {
                            currentJob = job;
                            this.shiftsToWork = numberOfShifts;
                            shiftsWorked = 0;
                            returnValue = true;
                        }
                    }
                    return returnValue;
                }
                return false;
}


