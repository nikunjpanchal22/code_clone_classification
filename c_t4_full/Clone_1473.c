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




#include <string.h>
#include <stdio.h>

int main()
{
    char str[] = "This is a simple string made with simple code", *p1, *p2;
    for (p1 = str; (p2 = strstr(p1, "simple")) != NULL; p1 = p2 + 6)
        memcpy(p2, "sample", 6);
    puts(str);
    return 0;
}


