int main () {
    char str [] = "ababbababa-1998";
    char * const first_part = strtok (str, "-");
    if (first_part == NULL) {
        return 1;
    }
    char * const second_part = strtok (NULL, "-");
    if (second_part == NULL) {
        return 1;
    }
    int nr = atoi (second_part);
    printf ("%d\n", nr);
    return 0;
}


 int main () {
    char str [] = "ababbababa-1998";
    char* first_part = malloc(strlen(str)+1);
    char* second_part = malloc(strlen(str)+1);
    int nr;

    size_t str_index = 0;
    size_t sub_str_index = 0;
    while(str[str_index] != '\0' && str[str_index] != '-'){
        first_part[sub_str_index] = str[str_index];
        str_index++;
        sub_str_index++;
    }
    first_part[sub_str_index] = '\0';

    sub_str_index = 0;
    str_index++;
    while(str[str_index] != '\0'){
        second_part[sub_str_index] = str[str_index];
        str_index++;
        sub_str_index++;
    }
    second_part[sub_str_index] = '\0';

    nr = atoi (second_part);
    printf ("%d\n", nr);
    free(first_part); 
    free(second_part);
    return 0;
}


