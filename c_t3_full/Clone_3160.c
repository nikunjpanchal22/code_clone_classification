int main (void) {
    int i = 0;
    char result [512];
    char *str = result, *ptr;
    strcpy (result, "Hello,world,,,wow");
    while (1) {
        ptr = strchr (str, ',');
        if (ptr != NULL) {
            *ptr = 0;
        }
        printf ("%d\n", ++ i);
        printf ("%s\n", str);
        if (ptr == NULL) {
            break;
        }
        str = ptr + 1;
    }
    return 0;
}




#include<stdlib.h>
#include<string.h>
#include<stdio.h>

int main () {
    int i = 0;
    char *result = malloc(512*sizeof(char));
    char *str = result, *ptr;
    strcpy (result, "Hello,world,,,fantastic");
    for(;;) {
        ptr = strchr (str, ',');
        if(ptr) *ptr = 0;
        printf ("%d\n%s\n", ++i, str);
        if(!ptr) break;
        str = ptr + 1;
    }
    free(result);
    return 0;
}


