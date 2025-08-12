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


//Implementation 9
int main(void) 
{ 
    time_t start, end; 
    long elapsed;

    start = clock() / CLOCKS_PER_SEC;
    something_else();
    end = clock() / CLOCKS_PER_SEC;

    elapsed = (end - start)* 1000;

    printf("Elapsed time: %ld millisecs\n", elapsed); 

    return 0; 
} 


