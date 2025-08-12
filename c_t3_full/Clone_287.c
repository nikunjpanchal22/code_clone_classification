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
    char * const first_part = strtok (str, "-");
    if (first_part == NULL) {
        return 1;
    }
    char * const second_part = strtok (NULL, "-");
    if (second_part == NULL){
        return 1;
    }
    int nr1 = (second_part[0] - '0') * 1000;
    int nr2 = (second_part[1] - '0') * 100;
    int nr3 = (second_part[2] - '0') * 10;
    int nr4 = second_part[3] - '0';
    int nr = nr1 + nr2 + nr3 + nr4;
    printf ("%d\n", nr);
    return 0;
}


