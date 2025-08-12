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






void loop(int c) {
	    if(c == 'n') return;
	    printf("Hello\n");
	    if(kbhit()) c = getch();
	    loop(c);
	}

	int main (void) {
	    loop(0);
	    return 0;
}


