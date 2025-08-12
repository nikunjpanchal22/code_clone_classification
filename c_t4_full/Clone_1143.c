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





#include <sys/resource.h>
int main()
{
    struct rusage r1, r2;
    getrusage(RUSAGE_SELF, &r1);
    something_else();
    getrusage(RUSAGE_SELF, &r2);
    int elapsed = ((r2.ru_utime.tv_sec - r1.ru_utime.tv_sec) * 1000) + ((r2.ru_utime.tv_usec - r1.ru_utime.tv_usec) / 1000);
    printf("Elapsed time: %d millisecs\n", elapsed);
    return 0;
}


