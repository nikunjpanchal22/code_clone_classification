int main () {
    char input [16] = "abc,d";
    char *p;
    p = strtok (input, ",");
    if (p) {
        printf ("%s\n", p);
    }
    p = strtok (NULL, ",");
    if (p)
        printf ("%s\n", p);
    return 0;
}


int main () {
    char input [16] = "abc,d";
    splitAndPrint(input, ",");
    return 0;
}


