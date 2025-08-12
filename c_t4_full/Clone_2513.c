int main () {
    int i = 42;
    int *p1 = &i;
    int **p2 = &p1;
    int ***p3 = &p2;
    int ****p4 = &p3;
    int *****p5 = &p4;
    int ******p6 = &p5;
    int *******p7 = &p6;
    int ********p8 = &p7;
    int *********p9 = &p8;
    mega_pointer (p9);
    printf ("%d\n", i);
}




#include<stdio.h>

void mega_pointer(int ********p){
  ********p = 90;
    }

int main () {
    int i = 42;
    int *p1 = &i;
    int **p2 = &p1;
    int ****p4 = &p2;
    mega_pointer (p4);
    printf ("%d\n", i);
    return 0;
}


