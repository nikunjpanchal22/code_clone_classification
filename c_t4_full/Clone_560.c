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
    char* ptr = strtok (text, " ");
    char* slash;
    char str1[20];
    char str2[20];

    slash = strpbrk(ptr, "/");
    *slash = '\0';
    strcpy(str1, ptr);
    slash++; //skip first "/"
    strcpy(str2, slash);
    slash = strpbrk(str2, "><![CDATA[");
    *slash = '\0';

    printf ("Found a: %s; and b: %s\n", str1, str2);
    return 0;
}


