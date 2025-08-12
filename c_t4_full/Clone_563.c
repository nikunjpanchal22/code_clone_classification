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


 int main (void) {
    char text [] = "123 123 123 abcdef/456->ghijklm/789 123 123";
    char *ptr = strtok (text, " ");
    char *slash;
    char str1[20];
    char str2[20];
 
    sscanf(ptr, "%[^/]/%[^/]", str1, str2);
    str2[strlen(str2) - 1] = '\0';  /*remove '>' */
 
    printf ("Found a: %s; and b: %s\n", str1, str2);
    return 0;
}


