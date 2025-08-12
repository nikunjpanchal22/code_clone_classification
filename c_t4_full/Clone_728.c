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



int main (void) {
    int i = 0;
    char result [512];
    size_t position;
    const char *str;

    strcpy (result, "Hello,world,,,wow");

    for (str = result; ; ) {
        position = strcspn (str, ",");
        printf ("%d\n", ++ i);
        printf ("%.*s\n", (int) position, str);
        if (position == strlen (str)) {
            break;
        }
        str += position + 1;
    }

    return 0;
}


