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


  int main(void){
    char data[] = "to=myself@gmail.com&cc=youself@gmail.com&title=&content=how are you?&signature=best regards.";
    int key, key_length;
    char *begin, *end;
    
    key = 0;
    begin = data;
    while (1) {
        // Find the beginning of the value
        for (end = begin; *end != '\0'; end++) {
            if (*end == '&' || *end == '=')
                break;
        }

        // Print the key and the value
        key_length = end - begin;
        if (key_length > 0)
            printf("Key:   %.*s\n", key_length, begin);

        if (*end == '\0')
            printf("Value: %.*s\n\n", end - begin, begin);
        else {
            begin = end + 1;
            printf("Value: %.*s\n\n", begin - end - 1, begin);
        }

        // Move to the next key
        if (*end == '\0')
            break;
        begin = end + 1;
    }
    return 0;
}


