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





void printHelloUntilNKeyPressed() {
	    int c = 0;
	    do {
		printf("Hello\n");
		if (kbhit()) {
		    c = getch();
		}
	    } while (c != 'n');
	}

	int main (void) {
	    printHelloUntilNKeyPressed();
	    return 0;
}


