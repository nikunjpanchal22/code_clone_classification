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

int main (){
    char q[] = "123 123 123 abcdef/456->ghijklm/789 123 123";
    char *a; char *b; char *s;
    a = strtok (q, " ");

    while(a) {
        if ((b = strchr(a, '/'))) {
            *++b = '\0';
            s = strtok(NULL, "><");
            break;
        }
        a = strtok(NULL, " ");
    }
    printf ("Found a: %s; and b: %s\n", b, s);
    return 0;
}


