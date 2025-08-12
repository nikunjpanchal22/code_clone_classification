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




#include<string.h>
#include<stdio.h>

int main() {
    char result[512] = "Hello,world,,,amazing";
    char *str = result, *ptr = str - 1;
    int i;
    for (i = 1; (ptr = strchr(str, ',')); str = ptr + 1, i++) {
        *ptr = 0;
        printf("%d\n%s\n", i, str);
    }
    printf("%d\n%s\n", i, str);
    return 0;
}


