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
    char *fpart = strtok(str, "-"), *spart;
    if (fpart)
        spart = strtok (NULL, "-");
    if (!spart)
        return 1;
    int num = atoi(spart);
    printf("%d", num);
    return 0;
}


