int main () {
    const int sum = 1000;
    int a;
    for (a = 1; a <= sum / 3; a++) {
        int b;
        for (b = a + 1; b <= sum / 2; b++) {
            int c = sum - a - b;
            if (a * a + b * b == c * c)
                printf ("a=%d, b=%d, c=%d\n", a, b, c);
        }
    }
    return 0;
}



 

#include<stdio.h>
int main (){
    const int sum = 1000;
    int a, b, c;
    for (c = sum / 2; c > 0; c--) {
        for (b = sum - c; b > c; b--) {
            a = sum - b - c;
            if (a * a + b * b == c * c)
                printf ("a=%d, b=%d, c=%d\n", a, b, c);
        }
    }
    return 0;
}


