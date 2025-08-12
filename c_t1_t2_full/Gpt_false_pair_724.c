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
    for (i = 0; str[i] != '\0'; i++) {
        for (j = 0; str[j] != '\0'; j++) {
            if (str[i] == str[j] && i < j) {
                printf("%c", str[i]);
                return 0;
            }
        }
    }
}
