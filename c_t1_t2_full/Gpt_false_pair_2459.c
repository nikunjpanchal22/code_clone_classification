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


int main (void) {
    struct timeval first, last;
    long mseconds, sec, usec;
    gettimeofday (& first, NULL);
    something ();
    gettimeofday (& last, NULL);
    sec = last.tv_sec - first.tv_sec;
    usec = last.tv_usec - first.tv_usec;
    mseconds = ((sec) *1000 + usec / 1000.0) + 0.5;
    printf ("Elapsed time: %ld millisecs\n", mseconds);
    return 0;
}
