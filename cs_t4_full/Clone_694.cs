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
                    int i;
                    for (i=0; i< jobsICanDo.Length; i++)
                    {
                        if (jobsICanDo[i] == job)
                        {
                            currentJob = job;
                            this.shiftsToWork = numberOfShifts;
                            shiftsWorked = 0;
                            break;
                        }
                    }
                    if(i == jobsICanDo.Length){
                        return false;
                    }
                    else{
                        return true;
                    }
                }
                return false;
}


