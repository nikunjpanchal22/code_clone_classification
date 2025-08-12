int main (int argc, char *argv []) {
    int a [N] = {0};
    while (next (a +N - 1, N) != 10) {
        for (int i = 0; i < N; i++) {
            if (a[i] != 0)
                printf ("%d", a[i]);
        }
        printf ("\n");
    }
    return 0;
}




int next(int *x, int n){
      while(n--){
        if(++x[n]<10)
          return x[n];
      }
      return 10;
}


