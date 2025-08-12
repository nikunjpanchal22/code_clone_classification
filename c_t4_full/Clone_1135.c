int main (void) {
    struct timeval start, end;
    long mtime, secs, usecs;
    gettimeofday (& start, NULL);
    something_else ();
    gettimeofday (& end, NULL);
    secs = end.tv_sec - start.tv_sec;
    usecs = end.tv_usec - start.tv_usec;
    mtime = ((secs) *1000 + usecs / 1000.0) + 0.5;
    printf ("Elapsed time: %ld millisecs\n", mtime);
    return 0;
}





#include <mach/mach_time.h>
#include <stdio.h>

void something_else (void);

int main()
{
    uint64_t start, end, elapsed;
    mach_timebase_info_data_t info;
    long mtime;
    
    start = mach_absolute_time();
    something_else();
    end = mach_absolute_time();
    
    elapsed = end - start;
    mach_timebase_info(&info);
    mtime = elapsed * info.numer / info.denom / 1e6;
    
    printf("Elapsed time: %ld millisecs\n", mtime);
    return 0;
}


