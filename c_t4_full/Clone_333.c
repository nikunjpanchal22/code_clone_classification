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
        int x = 0, y = 0;
		int asize = strlen(a); 
		int bsize = strlen(b);
		for (int i = 0; i < asize; i++) {
			if ((asize - x) < bsize) {
				break;
			}
			if (a[x] == b[y]) {
				int temp = x;
				while (a[x] == b[y] && b[y] != '\0') {
					x++;
					y++;
				}
				if (b[y] == '\0') {
					printf ("its a substring\n");
					break;
				}
				x = temp;
				y = 0;
			}
			x++;
		}
		if (y > 0) {
			printf ("not a substring\n");
		}
    }
    return 0;
}


