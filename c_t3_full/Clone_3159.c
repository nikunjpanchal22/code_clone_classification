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
    double dataset[100];
    int n;
    srand((unsigned int)time(NULL));
    for(n = 0; n < 100; n++)
       dataset[n] = ((double)rand()/(double)(RAND_MAX + 1));
    qsort(dataset, 100, sizeof(double), comp);
    for(n = 0; n < 100; n++)
      printf("%.10lf\n", dataset[n]);
    return 0;
  }


