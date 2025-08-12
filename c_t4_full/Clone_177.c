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


  int main(void) {
    char data[] = "to=myself@gmail.com&cc=youself@gmail.com&title=&content=how are you?&signature=best regards.";
    char* key = data;
    char* value;

    while (*key != '\0') {
        int key_len = strcspn(key, "=&");
        int value_len = 0;

        if (*(key + key_len) == '=') {
            value = key + key_len + 1;
            value_len = strcspn(value, "&");
        }

        printf("Key:   %.*s\nValue: %.*s\n\n", key_len, key, value_len, value);
        key = value + value_len + (value[value_len] == '&');
    }
    return 0;
}


