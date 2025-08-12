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
    char *split1 = strtok(str, "-");
    if (!split1) return 1;
    char *split2 = strtok(NULL, "-");
    if (!split2) return 1;
    int num = atoi(split2);
    printf("%d\n", num); 
    return 0;
}


