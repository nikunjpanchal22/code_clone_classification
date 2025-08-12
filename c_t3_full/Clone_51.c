int main (void) {
    int c = 0;
    while (c != 'n') {
        do {
            printf ("Hello\n");
        }
        while (!kbhit ());
        c = getch ();
    }
    return 0;
}



int main() {
	char c;
	do {
		printf("Hello\n");
		c = getch();
	} while (c != 'n');
	return 0;
}


