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





#include <windows.h>
int main() {
    LARGE_INTEGER startTime, endTime, frequency;
    QueryPerformanceFrequency(&frequency);
    QueryPerformanceCounter(&startTime);
    something_else();
    QueryPerformanceCounter(&endTime);
    printf("Elapsed time: %lf millisecs\n", (endTime.QuadPart- startTime.QuadPart) * 1000.0 / frequency.QuadPart);
    return 0;
}


