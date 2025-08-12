int main () {
    struct timespec time1, time2;
    int temp = 0;
    clock_gettime (CLOCK_PROCESS_CPUTIME_ID, & time1);
    for (int i = 0; i < 242000000; i++)
        temp += temp;
    clock_gettime (CLOCK_PROCESS_CPUTIME_ID, & time2);
    printf ("Time difference: %ld [s] %ld [ns]", (long) diff (time1, time2).tv_sec, (long) diff (time1, time2).tv_nsec);
    return 0;
}





int main () {
      struct timespec t1, t2;
      unsigned int x=0;
      clock_gettime(CLOCK_REALTIME_COARSE, &t1);
      for (unsigned int i = 0; i < 242000000; i++) {
        x+= x;
      }
      clock_gettime(CLOCK_REALTIME_COARSE, &t2);
      printf("Elapsed: %lu.%09lu\n", (long) (t2.tv_sec-t1.tv_sec), (long) (t2.tv_nsec-t1.tv_nsec));
      return 0;
}


