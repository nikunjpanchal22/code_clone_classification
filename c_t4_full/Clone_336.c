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
        int x = 0; 
		int asize = strlen(a); 
		int bsize = strlen(b); 
		int noMatch = 1;
		while (x < asize - bsize) { 
			int y = 0;
			while (y < bsize && a[x+y] == b[y]) { 
				y++;
				} 
			if (y == bsize) { 
				printf ("its a substring\n");
				noMatch = 0;
				break;
			}
			x++; 
		}
		if (noMatch == 1) {
			printf ("not a substring\n");
		}
    }
    return 0;
}


