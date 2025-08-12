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
      int count = 0, temp = 4, sum = 0;
      for(int i = 1; i <= 15; i++){
        if(i <= 5+count){
          sum = (i-count == 1) ? i-count : sum + temp--;
          printf("%d ", sum);
        }
        else{
          printf("\n");
          temp = 4;
          sum = 0;
          count += ++count;
          --i;
        }
      }
}


