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
#include <stdio.h>

void something_else (void);

int main()
{
    clock_t start, end;
    double mtime;

    start = clock();
    something_else();
    end = clock();
    
    mtime = ((double) (end - start)) / CLOCKS_PER_SEC * 1000;
    printf("Elapsed time: %.2f millisecs\n", mtime);
    return 0;
}


