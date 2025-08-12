int main () {
    int n, count;
    printf ("Insert a number:\n");
    scanf ("%d", & n);
    count = 0;
    n++;
    for (; count < 10; n++) {
        if (isPrime (n)) {
            printf ("%d\n", n);
            count++;
        }
    }
    return 0;
}






#include <stdbool.h>

bool isPrime(int n) {
      if(n<=1){
        return false;
      }
      for(int i = 2; i*i <= n; i++){
        if(n % i == 0){
          return false;
        }
      }
      return true;
    }

    int main() {
      int count = 0;
      int n;
      printf("Insert a number:\n");
      scanf("%d",&n);
      while(count != 10){
        n++;
        if(isPrime(n)){
          printf("%d\n", n);
          count++;
        }
      }
      return 0;
}


