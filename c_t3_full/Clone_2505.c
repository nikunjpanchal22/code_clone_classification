int main (void) {
    int start;
    if (scanf ("%d", &start) != 1)
        exit (1);
    int end = start;
    while (scanf ("%d", &end) == 1)
        ;
    for (int i = start; i <= end; i++)
        printf ("%d\n", i);
}


 


#include<stdlib.h>
int main(){
    int start, end, temp;
    if(scanf("%d", &temp) != 1) exit(1);
    start = end = temp;
    while(scanf("%d", &temp) == 1) end = temp;
    for(int i = start; i <= end; i++) printf("%d\n", i);
}


