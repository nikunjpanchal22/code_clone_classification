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
    size_t length, position;
    const char *str;

    strcpy (result, "Hello,world,,,wow");

    str = result;
    while (1) {
        position = strcspn (str, ",");
        length = strlen (str);
        printf ("%d\n", ++ i);
        if (position == length) {
            printf ("%s\n", str);
            break;
        }
        else {
            printf ("%.*s\n", (int) position, str);
        }
        str += position + 1;
    }

     return 0;
}


