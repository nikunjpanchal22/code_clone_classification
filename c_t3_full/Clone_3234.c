int main () {
    char *arr [20];
    int i, j;
    int size;
    char *revarr [20];
    printf (" enter the number of words\n");
    scanf ("%d", & size);
    for (i = 0; i < size; i++) {
        arr[i] = malloc (100);
        scanf ("%s", arr [i]);
    }
    for (i = 0; i < size; i++) {
        revarr[i] = arr[size - 1 - i];
    }
    printf (" the reversed sentence is: ");
    for (i = 0; i < size; i++) {
        printf ("%s ", revarr [i]);
    }
    printf ("\n");
    for (i = 0; i < size; i++) {
        free (arr [i]);
    }
    return 0;
}





#include <stdio.h>
#include <stdlib.h>
int main () {
    char * school [90];
    int i, num;
    printf ("Enter total students: \n");
    scanf ("%d", &num);
    for(i=0;i<num;i++){
        school[i]=(char*)malloc(sizeof(char)*15);
        scanf ("%s", school [i]);
    }
    printf ("Students : ");
    for(i=num-1;i>=0;i--){
        printf ("Reversed Order: %s", school [i]);
    }
    return 0;
}


