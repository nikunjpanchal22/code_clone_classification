int main (void) {
    unsigned int a [N];
    printf ("Enter %zu numbers: ", (size_t) N);
    for (size_t i = 0; i < N; i++) {
        scanf ("%u", & a [i]);
    }
    printf ("Prime numbers are: ");
    for (size_t i = 0; i < N; i++) {
        int prime = a[i] == 2 || a[i] % 2 == 1 && a[i] != 1;
        for (unsigned int j = 3; prime && j <= a[i] / j; j += 2) {
            prime = a[i] % j != 0;
        }
        if (prime)
            printf ("%u, ", a[i]);
    }
    putchar ('\n');
    return 0;
}




#include<stdio.h>
#define SIZE 20
void main(){
    unsigned int arr[SIZE];
    printf ("Enter %d numbers: ",SIZE);
    for (int i=0; i<SIZE; i++) {
        scanf ("%u",&arr[i]);
    }
    printf ("Prime numbers are: ");
    for(int i=0; i<SIZE; i++) {
        int count=0;
        if(arr[i]==1){
            continue;
        }
        for(int j=2; j<=arr[i]/2; j++) {
            if(arr[i]%j==0){
                count++;
                break;
            }
        }
        if(count==0){
            printf ("%u, ",arr[i]);
        }
    }
    printf("\n");
}


