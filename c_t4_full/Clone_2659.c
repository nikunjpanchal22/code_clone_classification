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
void print(int i, int j, int k){
      if(i > 5)
        return;
      if(j > i){
        printf("\n");
        print(i+1, 1, i+1);
      } else {
        printf("%d ", k);
        print(i, j+1, k+5-j);
      }
    }
    int main(){
      print(1, 1, 1);
      return 0;
}


