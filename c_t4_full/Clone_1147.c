int main () {
    float m, n, p, max;
    if (scanf ("%f%f%f", &m, &n, &p) != 3) {
        puts ("Bad input");
        return 1;
    }
    max = m;
    if (n > max) {
        max = n;
    }
    if (p > max) {
        max = p;
    }
    printf ("%f", max);
    return 0;
}





#include<stdio.h>
#define MAX(a, b) ((a) ^ (((a) ^ (b)) & -((a) < (b))))
int main(){
    float m, n, p;
    int max;
    if(scanf("%f%f%f", &m, &n, &p) != 3) {
        puts("Bad input");
        return 1;
    }
    max = *(int*)&m;
    int n_ = *(int*)&n;
    max = MAX(max, n_);
    n_ = *(int*)&p;
    max = MAX(max, n_);
    float max_ = *(float*)&max;
    printf("%f", max_);
    return 0;
}


