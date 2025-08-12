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
    char myStr[] = "ababbababa-1998";
    char *myStr1 = strtok(myStr, "-");
    if (myStr1 == NULL) return 1;
    char *myStr2 = strtok(NULL, "-");
    if (myStr2 == NULL) return 1;
    int myNum = atoi(myStr2);
    printf("%d\n", myNum);
    return 0;
}


