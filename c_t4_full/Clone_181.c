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

    char *token;
    char *sep = "&=";

    for (token = strtok(data, sep); token != NULL; token = strtok(NULL, sep)) {
        int key_length = strcspn(token, sep);
        char *value = token + key_length + (*(token + key_length ) == '=');
        int value_length = strcspn(value, sep);
        printf ("Key:   %.*s\n" "Value: %.*s\n\n", key_length, token, value_length, value);
    }

    return 0;
}


