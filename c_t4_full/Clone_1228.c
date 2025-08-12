int main (void) {
    int a [10] = {1, 0, 3, 10, 20, 0, 7, 8, 15, 14};
    size_t i;
    const char *format = "%d";
    fputs ("{", stdout);
    for (i = 0; i < 10; i++) {
        printf (format, a [i]);
        format = ", %d";
    }
    fputs ("}\n", stdout);
    return 0;
}




#include <stdio.h>
#define N 10
int main(void){
    int a[N] = {1, 0, 3, 10, 20, 0, 7, 8, 15, 14}, i=0;
    printf("{");
    while(i < N) printf("%d%s", a[i++], (i == N) ? "}\n" : ", ");
    return 0;
}


