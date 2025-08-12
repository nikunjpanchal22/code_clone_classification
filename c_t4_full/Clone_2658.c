int main () {
    int k, i, j;
    for (i = 1; i <= 5; i++) {
        k = i;
        for (j = 1; j <= i; j++) {
            printf ("%d ", k);
            k = k + (5 - j);
        }
        printf ("\n");
    }
}




#include<stdio.h>
    void print_sequence(){
      int k, i, j;
      for(i = 1; i <= 5; i++){
        k = i;
        for(j = 1; j <= i; j++){
          printf("%d ", k);
          k += 5 - j;
        }
        printf("\n");
      }
    }
    int main(){
      print_sequence();
      return 0;
}


