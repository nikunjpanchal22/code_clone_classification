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
    int index = 0;
    int pos = 0;
    char *key = (char *)malloc(100*sizeof(char));
    char *value = (char *)malloc(100*sizeof(char));

    memcpy(key, &data[index], 1);
    while(data[index] != '\0'){
        if(data[index] == '&' || data[index] == '='){
            memset(key, 0, pos);
            printf("Key:   %s\n", key);
            memcpy(value, &data[index+1], 1);
            pos = 0;
            index++;
            continue;
        } 
        else if(data[index+1] == '&' || data[index+1] == '\0'){
            memset(value, 0, pos);
            printf("Value: %s\n\n", value);
            pos = 0;
        }
        memcpy(key+pos, &data[index], 1);
        memcpy(value+pos, &data[index], 1);
        index++;
        pos++;
    }
    free(key);
    free(value);
    return 0;
}


