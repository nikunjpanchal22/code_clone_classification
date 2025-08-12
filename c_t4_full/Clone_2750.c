int main () {
    int n = 6;
    int tab [] = {1, 2, 8, 4, 5, 6};
    int maxdiff = 0;
    for (int i = 1; i < n; i++) {
        int diff = abs (tab[i] - tab[i - 1]);
        if (diff > maxdiff) {
            maxdiff = diff;
        }
    }
    printf ("%d\n", maxdiff);
    return 0;
}



 

#include<stdio.h>
#include<stdlib.h>

int main () {
    int list[6] = {1, 2, 8, 4, 5, 6}, maxd = 0, i;
    
    for(i=0; i<5; i++) maxd = (abs(list[i+1] - list[i]) > maxd)? abs(list[i+1] - list[i]) : maxd ;
   
    printf ("%d\n", maxd);
   
    return 0;
}


