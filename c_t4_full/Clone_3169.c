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
    char result[512] = "Hello,world,,,brilliant";
    char *str = result, *ptr;
    for(int i = 0;; i++) {
        ptr = strchr(str, ',');
        if(ptr != NULL) {
            *ptr = 0;
        } else {
            printf("%d\n%s\n", i + 1, str);
            break;
        }
        printf("%d\n%s\n", i + 1, str);
        str = ptr + 1;
    }
    return 0;
}


