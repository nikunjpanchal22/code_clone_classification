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
		while (x < asize && y < bsize) 
		{ 
			if (a[x] == b[y]) { 
				if (y == bsize-1) 
					break; 
				else {
					x++;
					y++; 
				}
			}
			else { 
				x = x - y + 1; 
				y = 0; 
			} 
		}
		if (y == bsize) {
			printf ("its a substring\n");
		}
		else {
			printf ("not a substring\n");
		}
    }
    return 0;
}


