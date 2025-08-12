int main () {
    char str [] = "This is a simple string made with simple code";
    char *pch;
    int i = 0, count = 0;
    for (i = 0; i < strlen (str); i++) {
        if (str[i] == 's' && str[i + 1] == 'i' && str[i + 2] == 'm' && str[i + 3] == 'p' && str[i + 4] == 'l' && str[i + 5] == 'e') {
            count++;
        }
    }
    for (i = 1; i <= count; i++) {
        pch = strstr (str, "simple");
        strncpy (pch, "sample", 6);
    }
    puts (str);
    return 0;
}




#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "This is a simple string made with simple code";
    int increment = strlen("simple");
    char *ptr = strstr(str, "simple");
    while(ptr != NULL) {
        strncpy(ptr, "sample", increment);
        ptr = strstr(ptr + increment, "simple");
    }
    printf("%s", str);
    return 0;
}


