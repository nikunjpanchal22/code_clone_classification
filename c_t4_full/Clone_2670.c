int main () {
    int i, j;
    for (i = 1; i <= 5; i++) {
        int temp = 4;
        int sum = 0;
        for (j = 1; j <= i; j++) {
            if (j == 1)
                sum = i;
            else {
                sum = sum + temp--;
            }
            printf ("%d ", sum);
        }
        printf ("\n");
    }
}





void loopJ(int i, int j, int temp, int sum){
      if(j <= i){
        sum = (j == 1) ? i : sum + temp--;
        printf("%d ", sum);
        loopJ(i, j + 1, temp, sum);
      }
      else
        printf("\n");
    }

    void loopI(int i)
    {
      if(i <= 5)
      {
        int temp = 4, sum = 0;
        loopJ(i, 1, temp, sum);
        loopI(i+1);
      }
    }

    int main()
    {
      loopI(1);
}


