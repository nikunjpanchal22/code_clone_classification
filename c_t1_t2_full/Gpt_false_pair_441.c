int main () {
    char str [5] [100];
    for (int i = 0; i < 5; i++) {
        fgets (str [i], 100, stdin);
    }
    for (int j = 0; j < 5; j++) {
        printf ("%s\n", str [j]);
    }
    return 0;
}


  int main () {
    char str [5] [100];
    for (int i = 0; i < 5; i++) {
        fscanf (stdin, "%99[^\n]", str[i]);
        getc(stdin);
    }
    for (int j = 0; j < 5; j++) {
        printf ("%s\n", str [j]);
    }
    return 0;
}
