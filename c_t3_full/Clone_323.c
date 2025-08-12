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
        char line[200];
        fgets(line, sizeof line, stdin);
        line[strcspn(line, "\n")] = '\0';
        strncpy (str[i], line, 100);
    }
    for (int j = 0; j < 5; j++) {
        printf ("%s\n", str [j]);
    }
    return 0;
}


