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
void print(int k){
      printf("%d ", k);
    }
    int main(){
      int k, i, j;
      for(i = 1; i <= 5; i++){
        k = i;
        for(j = 1; j <= i; j++){
          print(k);
          k = k + (5 - j);
        }
        printf("\n");
      }
      return 0;
}


