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
		for (j = 0; j < strlen(str); j++) {
			if (str[i] == str[j] && i != j) {
				printf("%c", str[i] + 32);
				return 0;
			}
			else if (str[i] == str[j] + 32 && str[i] + 32 == str[j] && i != j) {
				printf("%c", str[i] - 32);
				return 0;
			}
		}
	}
}


