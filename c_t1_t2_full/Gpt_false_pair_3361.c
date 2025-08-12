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
    char example [] = "ababbababa-1234";
    char * const first = strtok (example, "-");
    if (first == NULL) {
        return 1;
    }
    char * const second = strtok (NULL, "-");
    if (second == NULL) {
        return 1;
    }
    int number = atoi (second);
    printf ("%d\n", number);
    return 0;
}
