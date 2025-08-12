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




int main() {
    char str[] = "ababbababa-1998";
    char *token1 = strtok(str, "-"), *token2;
    if (token1 && (token2 = strtok(NULL, "-")))
        printf("%d", atoi(token2));
    else
        return 1;
    return 0;
}


