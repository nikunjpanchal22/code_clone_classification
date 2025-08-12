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
  int *p = malloc(sizeof(int));
  *p = 0;
  clock_gettime(CLOCK_MONOTONIC, &time1);
  for (int i = 0; i < 242000000; i++)
    *p += *p;
  clock_gettime(CLOCK_MONOTONIC, &time2);
  printf ("Time difference: %ld.%ld [s]\n", (time2.tv_sec - time1.tv_sec), (time2.tv_nsec - time1.tv_nsec));
  free(p);
  return 0;
}


