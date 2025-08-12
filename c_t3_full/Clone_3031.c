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





int main() {
      struct timespec begin, end;
      volatile unsigned long temp = 0ul;
      clock_gettime(CLOCK_REALTIME_COARSE, &begin);
      for (unsigned long i = 0; i < 242000000ul; i++) {
        temp += temp;
      }
      clock_gettime(CLOCK_REALTIME_COARSE, &end);
      printf ("Elapsed Time: %ld sec %ld nsec\n", end.tv_sec - begin.tv_sec, end.tv_nsec - begin.tv_nsec);
      return 0;
}


