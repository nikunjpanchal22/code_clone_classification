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
    char * str[25];
    int limit, i;
    printf ("Enter limit: \n");
    scanf ("%d", &limit);
    for(i=0;i<limit;i++){
        str[i] = (char*)malloc(sizeof(char)*15);
        scanf ("%s",str[i]);
    }
    for (i = limit-1; i >= 0; i--){
        printf (" %s", str [i]);
    }
    free(str);
    return 0;
}


