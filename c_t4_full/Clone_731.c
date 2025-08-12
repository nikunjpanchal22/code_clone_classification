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
    const char *str;
    
    strcpy (result, "Hello,world,,,wow");
    
    for (str = strtok (result, ","); str; str = strtok (NULL, ",")) {
        printf ("%d\n", ++ i);
        printf ("%s\n", str);
    }
    
     return 0;
}


