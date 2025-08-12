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
                    int jobFoundAtIndex = -1;

                    for (int i = 0; i < jobsICanDo.Length; i++)
                    {
                        if(jobsICanDo[i] == job)
                        {
                            jobFoundAtIndex = i;
                            break;
                        }
                    }

                    if(jobFoundAtIndex != -1) 
                    {
                        currentJob = job;
                        this.shiftsToWork = numberOfShifts;
                        shiftsWorked = 0;
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
                return false;
}


