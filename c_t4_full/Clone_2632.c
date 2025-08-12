int main (void) {
    char text [] = "123 123 123 abcdef/456->ghijklm/789 123 123";
    char *ptr = strtok (text, " ");
    char *slash;
    char *str1;
    char *str2;
    while (ptr) {
        if (slash = strstr (ptr, "/")) {
            *slash = '\0';
            str1 = ptr;
            ptr = ++slash;
            break;
        }
        ptr = strtok (NULL, " ");
    }
    str2 = strtok (ptr, "><![CDATA[");
    while (ptr) {
        if (slash = strstr (ptr, "/")) {
            *slash = '\0';
            str2 = ptr;
            break;
        }
        ptr = strtok (NULL, " ");
    }
    printf ("Found a: %s; and b: %s\n", str1, str2);
    return 0;
}





#include <stdio.h>
#include <string.h>

int main(void) {
    char text [] = "123 123 123 abcdef/456->ghijklm/789 123 123";
    char *p; char *s1; char *s2;
    p = strtok (text, " ");

    while (p != NULL) {
        if (s1 = strchr(p, '/')) {
            *s1++;
            s2 = strtok(NULL, "[]");
            break;
        }
        p = strtok (NULL, " ");
    }
    printf ("Found a: %s; and b: %s\n", s1, s2);
    return 0;
}


