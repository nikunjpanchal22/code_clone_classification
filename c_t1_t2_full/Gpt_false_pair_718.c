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
	int forward, backward;
	char str[1000];
	scanf("%s", str);
	for (forward = 0; str[forward] != '\0'; forward++) {
		for (backward = strlen(str) - 1; backward >= 0; backward--) {
			if (str[forward] == str[backward] && forward != backward) {
				printf("%c", str[forward]);
				return 0;
			}
		}
	}
}
