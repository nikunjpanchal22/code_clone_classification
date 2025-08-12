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
    int count = 1;
    char str[] = "Hello,world,,,impressive";
    for(char *p = strtok(str, ","); p != NULL; p = strtok(NULL, ",")) {
        printf("%d\n%s\n", count++, p);
    }
    return 0;
}


