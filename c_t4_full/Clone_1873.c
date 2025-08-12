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
int main () {
    int start, end;
    if (scanf ("%d", &start) != 1) {exit (EXIT_FAILURE);}
    end = start;    
    while (scanf("%d", &end) == 1){}  
    int i = start;
    while (i <= end){
        printf ("%d\n", i);
        i++;
    }
    return 0;
}


