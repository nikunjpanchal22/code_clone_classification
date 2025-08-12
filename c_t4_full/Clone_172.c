int main (void) {
    char data [] = "to=myself@gmail.com&cc=youself@gmail.com&title=&content=how are you?&signature=best regards.";
    char *key = data;
    do {
        int key_length = strcspn (key, "&=");
        char *value = key + key_length + (key[key_length] == '=');
        int value_length = strcspn (value, "&");
        printf ("Key:   %.*s\n" "Value: %.*s\n\n", key_length, key, value_length, value);
        key = value + value_length + (value[value_length] == '&');
    }
    while (*key);
    return 0;
}


 int main (void) {
    char data [] = "to=myself@gmail.com&cc=youself@gmail.com&title=&content=how are you?&signature=best regards.";
    char *p1, *p2, *d;
    char *str = strdup (data);
    p1 = str;
    while (*p1) {
        int key_length;
        p2 = p1;
        while (*p2 != '=' && *p2 != '&' && *p2 != 0)
            p2++;

        key_length = p2 - p1;
        d = (char *) malloc(key_length + 1);
        strncpy (d, p1, key_length);
        d[key_length] = 0;
        printf ("Key:   %s\n", d);

        if (*p2 == '=') {
            p2++;
            int value_length;
            p1 = p2;
            while (*p1 != '&' && *p1 != 0)
                p1++;
            value_length = p1 - p2;
            free (d);
            d = (char *) malloc (value_length + 1);
            strncpy (d, p2, value_length);
            d[value_length] = 0;
            printf ("Value: %s\n\n", d);
        }
        else {
            printf ("Value: \n\n");
        }

        p1 = p1 + 1;
        free (d);
    }
    free (str);
    return 0;
}


