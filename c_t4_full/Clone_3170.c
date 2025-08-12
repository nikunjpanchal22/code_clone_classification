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
    char result[] = "Hello,world,,,remarkable";
    char* ptr = NULL;
    int count = 0;
    for(int i = 0; i < 512; i++) {
        if(result[i] == ',') {
            result[i] = '\0';
            printf("%d\n%s\n", ++count, ptr ? ptr + 1 : result);
            ptr = &result[i];
        } else if(result[i] == '\0') {
            printf("%d\n%s\n", ++count, ptr + 1);
            break;
        }
    }
    return 0; 
}


