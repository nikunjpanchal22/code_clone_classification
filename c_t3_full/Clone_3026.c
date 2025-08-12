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
  int *x = calloc(1, sizeof(int));
  clock_gettime(CLOCK_BOOTTIME, &t1);
  for (int i = 0; i < 242000000; i++)
    *x += *x;
  clock_gettime(CLOCK_BOOTTIME, &t2);
  printf("Elapsed: %ld.%09ld\n", (long) (t2.tv_sec-t1.tv_sec), (long) (t2.tv_nsec-t1.tv_nsec));
  free(x);
  return 0;
}


