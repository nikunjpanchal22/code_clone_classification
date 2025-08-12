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
    struct timespec start, finish;
    clock_gettime (CLOCK_PROCESS_CPUTIME_ID, & start);
    clock_gettime (CLOCK_PROCESS_CPUTIME_ID, & finish);
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
