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
    char string [] = "xyzxyzxyz-4656";
    char * const part_one = strtok (string, "-");
    if (part_one == NULL) {
        return 1;
    }
    char * const part_two = strtok (NULL, "-");
    if (part_two == NULL) {
        return 1;
    }
    int num = atoi (part_two);
    printf ("%d\n", num);
    return 0;
}
