int main () {
    int Sum [12] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    int Choice;
    printf ("Pick Your Time's Table\n");
    printf ("|2|3|4|5|6|7|8|9|10|11|12|\n");
    printf ("===========================\n");
    scanf ("%d", & Choice);
    int i;
    for (i = 0; i < 12; i++) {
        printf ("%d X %d = %d\n", Choice, Sum [i], Choice * Sum [i]);
    }
    return 0;
}





#include<stdio.h>
int main () {
int numArray[13],n,i;
for(i=1;i<=12;i++)
numArray[i]=i;
printf("\nInput a number between 2 and 12 : ");
scanf("%d",&n);
for(i=0;i<=11;i++)
printf("\n%d * %d = %d",n,numArray[i],n*numArray[i]);
return 0;                
}


