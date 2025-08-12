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
        int x = strlen(a); 
		int y = strlen(b); 
		for (int i = 0; i <= x - y; i++) {
			int j;
			for (j = 0; j <= y; j++) 
				if (a[i+j] != b[j]) 
					break; 
			if (j == y) { 
				printf ("its a substring\n");
				break; 
			} 
		}
		if (y > 0) {
			printf ("not a substring\n");
		}
    }
    return 0;
}


