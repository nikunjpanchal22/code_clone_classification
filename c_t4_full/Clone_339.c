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
        int lengthA = strlen (a);
        int lengthB = strlen (b);
        for (int i = 0; i < lengthA - lengthB; i++) {
            int j;
            for (j = 0; j < lengthB; j++) {
                if (a[i+j] != b[j])
                    break;
            }
            if (j == lengthB) {
                printf ("its a substring\n");
                break;
            }
        }
        if (lengthB > 0) {
			printf ("not a substring\n");
		}
    }
    return 0;
}


