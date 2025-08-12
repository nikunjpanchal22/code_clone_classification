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
      struct timespec t1, t2;
      volatile unsigned long temp = 0;
      clock_gettime(CLOCK_MONOTONIC, &t1);
      for (unsigned long i = 0; i < 242000000; i++) {
        temp += temp;
      }
      clock_gettime(CLOCK_MONOTONIC, &t2);
      printf ("Elapse Time: %ld sec %ld nsec\n", t2.tv_sec - t1.tv_sec, t2.tv_nsec - t1.tv_nsec);
      return 0;
}


