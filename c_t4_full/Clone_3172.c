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

int main() {
    int counter = 0;
    char result[512], *str = result, *ptr;
    strcpy(result, "Hello,world,,,magnificent");
    while((ptr = strchr(str, ',')) || (ptr = strchr(str, '\0'))) {
        *ptr = 0;
        printf("%d\n%s\n", ++counter, str);
        if(*str == '\0') break;
        str = ptr + 1;
    }
    return 0;
}


