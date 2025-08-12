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



int main () {
    int i, j;
    char str[1000];
    scanf("%s", str);
    for (i = 0; str[i] != '\0'; i++) {
        if( str[i] >= 'A' && str[i] <= 'Z') {
            str[i] += 32;
        }
        for (j = i + 1; str[j] != '\0'; j++) {
            if (str[i] == str[j] && str[i] >= 'a' && str[i] <= 'z') {
                printf("%c", str[j] - 32);
                return 0;
            }
        }
    }
}


