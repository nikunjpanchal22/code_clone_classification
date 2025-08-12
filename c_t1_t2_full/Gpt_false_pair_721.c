int main () {
    int i, j;
    char str [1000];
    scanf ("%s", str);
    for (i = 0; str[i] != '\0'; i++) {
        for (j = i + 1; str[j] != '\0'; j++) {
            if (str[i] == str[j]) {
                printf ("%c", str [i]);
                return 0;
            }
        }
    }
}



int main() {
    int i, j;
    char str[1000];
    scanf("%s", str);
    for (i = 0; str[i + 1] != '\0'; i++) {
        for (j = i + 1; str[j] != '\0'; j++) {
            if (str[i] == str[j] && j != i + 1) {
                printf("%c", str[i]);
                return 0;
            }
        }
    }
}
