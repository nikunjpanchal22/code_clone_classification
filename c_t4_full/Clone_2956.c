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
  struct timespec start, end;
  double accum;
  long sum = 0;
  clock_gettime(CLOCK_PROCESS_CPUTIME_ID, &start);
  for (long i = 0; i < 242000000; i++)
    sum += sum;
  clock_gettime(CLOCK_PROCESS_CPUTIME_ID, &end);
  accum = ( end.tv_sec - start.tv_sec )
          + ( end.tv_nsec - start.tv_nsec )
            / 1E9;
  printf("%lf\n", accum);
  return EXIT_SUCCESS;
}


