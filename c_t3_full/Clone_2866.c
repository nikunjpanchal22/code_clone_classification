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

int main() {
    int num[6] = {1, 2, 8, 4, 5, 6};
    int diff = 0;
    
    for(int x=1; x<6 ; ++x) {
        int d = abs(num[x] - num[x - 1]);
        diff = d > diff ? d : diff;
    }
    
    printf ("%d\n", diff);
    return 0;
}


