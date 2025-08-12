int main () {
    struct timespec start, finish;
    clock_gettime (CLOCK_REALTIME, & start);
    clock_gettime (CLOCK_REALTIME, & finish);
    long seconds = finish.tv_sec - start.tv_sec;
    long ns = finish.tv_nsec - start.tv_nsec;
    if (start.tv_nsec > finish.tv_nsec) {
        --seconds;
        ns += 1000000000;
    }
    printf ("seconds without ns: %ld\n", seconds);
    printf ("nanoseconds: %ld\n", ns);
    printf ("total seconds: %e\n", (double) seconds + (double) ns / (double) 1000000000);
}


  int main () {
     timeval start, end;
     gettimeofday (&start, NULL);
     // perform process
     gettimeofday (&end, NULL);
     long seconds = (end.tv_sec - start.tv_sec);
     long useconds = (end.tv_usec - start.tv_usec); 
     double mtime = (((seconds) * 1000 + useconds/1000.0) + 0.5)/1000;
     printf ("total seconds: %e\n", mtime);
}    

  int main () {
     struct timeval start_tv, end_tv;
     gettimeofday(&start_tv, NULL);
     // perform process
     gettimeofday(&end_tv, NULL);
     suseconds_t start_ms, end_ms;
     start_ms = (suseconds_t)start_tv.tv_sec * 1000 + start_tv.tv_usec / 1000;
     end_ms   = (suseconds_t)end_tv.tv_sec * 1000 + end_tv.tv_usec / 1000;
     double totalMilliseconds = (end_ms - start_ms);
     printf ("total seconds: %e\n", totalMilliseconds / 1000);
}


