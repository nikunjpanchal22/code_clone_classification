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
    double nums[100];
    int a;
    srand((unsigned int)getpid());
    for(a = 0; a < 100; a++)
      nums[a] = ((double)rand() / RAND_MAX);
    qsort(nums, 100, sizeof(double), cmp);
    for(a = 0; a < 100; a++)
      printf("%.10lf\n", nums[a]);
    return 0;
  }


