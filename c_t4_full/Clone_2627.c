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
    char txt[] = "123 123 123 abcdef/456->ghijklm/789 123 123";
    char *point; char *s1; char *s2;
    char *tk = strtok (txt, " ");

    while (tk) {
        if (point = strchr(tk, '/')) {
            *point = 0;
            s1 = tk;
            tk = point + 1;
            break;
        }
        tk = strtok (0, " ");
    }
    s2 = strtok (tk, "<[CDATA]");
    printf ("Found a: %s; and b: %s\n", s1, s2);
    return 0;
}


