int main () {
    int a [10], i, j, flag = 0;
    printf ("Please Enter 10 Numbers");
    for (i = 0; i < 10; i++)
        scanf ("%d", &a[i]);
    for (i = 0; i < 10; i++) {
        for (j = i + 1; j < 10; j++) {
            if (a[i] == a[j]) {
                flag++;
                printf ("Array Element %d and %d are equal", i, j);
            }
        }
    }
    printf ("\nThe Equal Numbers In The Array Are = %d", flag);
    return 0;
}





#include<stdio.h>

int main() {

    int a[10], i, j, isEqualFlag;

    printf("Enter 10 Number: ");
    for(i=0; i<10; i++) { scanf("%d",&a[i]); }

    isEqualFlag = 0;

    for(i=0; i<10; i++)
        for(j = i+1; j < 10; j++)
            if(a[i] == a[j]) {
                printf("\n%dth and %dth elements are same", i+1, j+1);
                isEqualFlag++;
            }

    printf("\nNo. of Equal elements: %d", isEqualFlag);

    return 0;
}


