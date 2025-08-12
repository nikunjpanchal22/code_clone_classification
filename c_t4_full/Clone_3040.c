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

bool isPrime(int num) {
      if (num < 2)
        return false;
      for (int i = 2; i * i <= num; i++) {
        if (num % i == 0)
          return false;
      }
      return true;
    }

    int main() {
      int n, count=0;
      printf("Insert a number:\n");
      scanf("%d", &n);
      while(count < 10){
        n++;
        if(isPrime(n)){
          printf("%d\n", n);
          count++;
        }
      }
      return 0;
}


