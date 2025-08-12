int main (void) {
    char a [100], b [100], c;
    if (scanf ("%99[^\n]%c%99[^\n]", a, &c, b) == 3 && c == '\n') {
        if (strstr (a, b))
            printf ("its a substring\n");
        else
            printf ("not a substring\n");
    }
    return 0;
}


 int main (void) {
    char a [100], b [100], c;
    if (scanf ("%99[^\n]%c%99[^\n]", a, &c, b) == 3 && c == '\n') {
        int index = 0;
        char* ptr = strstr (a, b);
        if (ptr != NULL) {
			printf("its a substring\n");
		}
		else {
			printf("not a substring\n");
		}
    }
    return 0;
}


