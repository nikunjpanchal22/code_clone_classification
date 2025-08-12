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
#define loop(n) for(int i=1,i<=n,i++)
int main(){
      int k, i, j;
      loop(5){
        k=i;
        loop(i){
          printf("%d ",k);
          k+=5-i;
        }
        printf("\n");
      }
}


