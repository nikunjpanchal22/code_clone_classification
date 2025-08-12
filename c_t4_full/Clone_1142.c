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





#include <time.h>
int main (){
    struct timespec start, end;
    clock_gettime(CLOCK_MONOTONIC, &start);
    something_else();
    clock_gettime(CLOCK_MONOTONIC, &end);
    int elapsed = (end.tv_sec - start.tv_sec) * 1000 + (end.tv_nsec - start.tv_nsec) / 1000000;
    printf("Elapsed time: %d millisecs\n", elapsed);
    return 0;
}


