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
    char input[] = "ababbababa-1998";
    char * const segment1 = strtok(input, "-");
    if (segment1 == NULL) return 1;
    char * const segment2 = strtok(NULL, "-");
    if (segment2 == NULL) return 1;
    int number = strtol(segment2, NULL, 10);
    printf("%d\n", number);
    return 0;
}


