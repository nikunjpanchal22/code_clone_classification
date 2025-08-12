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


  int main () {
    char data[] = "to=myself@gmail.com&cc=youself@gmail.com&title=&content=how are you?&signature=best regards.";
    int i, j;
    for (i = 0; i < strlen(data); i++) {
        char *end;
        end = &data[i];
        for (j = i; *end != 0 && *end != '&' && *end != '='; end++) {
        }

        if (end - &data[i]) {
            printf("Key:   %.*s\n", (int)(end - &data[i]), &data[i]);
            i = end - data;
        }

        if (*end == 0) {
            printf("Value: %.*s\n\n", (int)(end-&data[i]), &data[i]);
            break;
        }
        else if (*end == '=') {
            printf("Value: %.*s\n\n", (int)(end-&data[i]), &data[i+1]);
            i = end - data;
        }
    }

    return 0;
}


