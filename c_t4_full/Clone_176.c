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
    int i, j;

    for (i = 0; i < strlen(data); i++) {
        if (data[i] == '&' || data[i] == '=')
            printf("Key:   ");
        else
            printf("%c", data[i]);

        if (data[i] == '&' || data[i] == '=') {
            for (j = i + 1; data[j] != '&' && data[j] !=
            '=' && data[j] != '\0'; j++)
        printf("%c", data[j]);
        printf("\nValue: ");
        }
    printf("\n\n");
    }
    return 0;
}


