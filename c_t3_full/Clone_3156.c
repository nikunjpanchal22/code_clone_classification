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
      double arr[100];
      int j;
      srandom(time(NULL));
      for(j = 0; j < 100; j++)
         arr[j] = ((double)random()/(double)(RAND_MAX)) * 1.0;
      qsort(arr, 100, sizeof(double), cmpfunc);
      for(j = 0; j < 100; j++)
        printf("%f\n", arr[j]);
      return 0;
    }




  int main(void) {
    double array[100];
    int k;
    for(k = 0; k < 100; k++)
       array[k] = rand() / (RAND_MAX * 1.0);
    qsort(array, 100, sizeof(double), compare);
    for(k = 0; k < 100; k++)
      printf("%f\n", array[k]);
    return 0;
  }


