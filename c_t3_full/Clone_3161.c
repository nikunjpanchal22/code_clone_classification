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



#include<stdio.h>
#include<string.h>

int main (void) {
    int i = 0;
    char result [512];
    char *str = result, *ptr;
    strcpy (result, "Hello,world,,,extraordinary");
    do {
        ptr = strchr (str, ',');
        if (ptr) *ptr = 0;
        printf ("%d\n%s\n", ++i, str);
        str = ptr ? ptr + 1 : NULL;
    } while (ptr);
    return 0;
}


