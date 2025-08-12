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





void printVal(int i, int count, int temp, int sum){
      if(count <= i){
        sum = (count == 1) ? i : sum + temp--;
        printf("%d ", sum);
        printVal(i, count+1, temp, sum);
      }
    }

    int main(){
      for(int i = 1; i <= 5; i++){
      int temp = 4, sum = 0;
      printVal(i, 1, temp, sum);
      printf("\n");
      }
}


