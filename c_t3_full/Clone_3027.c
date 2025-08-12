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
      struct timespec start_time, end_time;
      long temp = 0;
      clock_gettime(CLOCK_REALTIME, &start_time);
      for (long i = 0; i < 242000000; i++) {
        temp += temp;
      }
      clock_gettime(CLOCK_REALTIME, &end_time);
      printf ("Duration: %ld.%09ld s\n", end_time.tv_sec - start_time.tv_sec, end_time.tv_nsec - start_time.tv_nsec);
      return 0;
}


