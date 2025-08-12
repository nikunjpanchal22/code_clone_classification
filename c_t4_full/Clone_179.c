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
    char data[] = "to=myself@gmail.com&cc=youself@gmail.com&title=&content=how are you?&signature=best regards.";
    char *token;
    const char delim[] = "&=";
    token = strtok(data, delim);
    while(token != NULL)
    {
        printf("Key: %s\n", token);
        token = strtok(NULL, delim);
        printf("Value: %s\n\n", token);
        token = strtok(NULL, delim);
    } 
    return 0;
}


