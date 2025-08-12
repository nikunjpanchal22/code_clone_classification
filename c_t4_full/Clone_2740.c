int main (void) {
    int i = 1, j = 1;
    while (j != 0) {
        j = (i <= 5);
        i = i + 1;
        printf ("%d  %d", i, j);
    }
    return 0;
}



  

#include <stdio.h>
void loop(int i, int j){
            if(j != 0){
                i++;
                j = (i <= 5);
                printf ("%d  %d", i, j);
                loop(i,j);
            }
        }
        int main (void) {
            int i = 1;
            int j = 1;
            loop(i,j);
            return 0;
}


