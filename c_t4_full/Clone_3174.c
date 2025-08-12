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

#define STR_SIZE 512

int main() {
    char result[STR_SIZE], *str, *ptr;
    strcpy(result, "Hello,world,,,wonderful");
    for(str = ptr = result, ptr = strchr(str, ','); ptr || str < result + STR_SIZE; ptr = strchr(str, ',')) {
        if(ptr) *ptr = 0;
        printf("%d\n%s\n", (int)(str - result + 1), str);
        str = ptr ? ptr + 1 : NULL;
    }
    return 0;
}


