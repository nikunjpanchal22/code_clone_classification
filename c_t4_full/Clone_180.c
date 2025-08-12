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
    char* digit;
    digit = strtok(data, "&=");
    while(digit != NULL)
    {
        printf("Key: %s\n", digit);
        digit = strtok(NULL, "&=");
        printf("Value: %s\n\n", digit);
        digit = strtok(NULL, "&=");
    } 
    return 0;
}


