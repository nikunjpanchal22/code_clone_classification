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

#define STRING "Hello,world,,,unbelievable"

int main() {
    char result[512];
    int i = 0;
    char *str = result, *ptr = NULL;
    strcpy(result, STRING);
    while(1) {
        ptr = strchr (str, ',');
        if(ptr != NULL) *ptr = 0;
        printf ("%d\n%s\n", ++i, str);
        str = (ptr != NULL) ? ptr + 1 : NULL;
        if(str == NULL) break;
    }
    return 0;
}


