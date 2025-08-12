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
    char inputStr[] = "ababbababa-1998";
    char *part1 = strtok(inputStr, "-"), *part2;
    if (!part1 || !(part2 = strtok(NULL, "-")))
        return 1;
    printf("%d", std::atoi(part2));
    return 0;
}


