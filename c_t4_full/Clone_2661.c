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





int main(){
      int i = 1, j;
      do{
        int temp = 4, sum = 0;
        j = 1;
        do{
          sum = j == 1 ? i : sum + temp--;
          printf("%d ", sum);
          j++;
        }while(j <= i);
        printf("\n");
        i++;
    }while(i <= 5);
}


