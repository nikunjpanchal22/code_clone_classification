int main (void) {
    double d [100];
    int i;
    for (i = 0; i < 100; i++)
        d[i] = rand () / ((double) RAND_MAX + 1);
    qsort3way (d, 100, sizeof (* d), cmp_double);
    for (i = 0; i < 100; i++)
        printf ("%.10lf\n", d[i]);
    return 0;
}





  int main(void) {
    double d_arr[100];
    int t;
    srand((unsigned int)time(NULL));
    for(t = 0; t < 100; t++)
      d_arr[t] = (double)rand() / (RAND_MAX + 1.0);
    qsort(d_arr, 100, sizeof(double), doubleCompare);
    for(t = 0; t < 100; t++)
      printf("%.10lf\n", d_arr[t]);
    return 0;
  }


