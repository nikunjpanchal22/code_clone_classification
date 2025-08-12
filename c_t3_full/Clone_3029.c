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
      struct timespec time1, time2;
      volatile int temp = 0;
      clock_gettime (CLOCK_REALTIME, &time1);
      for (long i = 0; i < 242000000L; i++) {
        temp += temp;
      }
      clock_gettime (CLOCK_REALTIME, &time2);
      printf ("Time difference: %ld.%ld [s]\n", (time2.tv_sec - time1.tv_sec), (time2.tv_nsec - time1.tv_nsec));
      return 0;
}


