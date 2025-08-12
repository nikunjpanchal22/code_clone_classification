int main (void) {
    int c, last, state;
    last = 0;
    state = OUT;
    while ((c = getchar ()) != EOF) {
        if (c == ' ' || c == '\n' || c == '\t') {
            if (last != ' ' && last != '\n' && last != '\t' && last != 0) {
                state = OUT;
                printf ("\n");
            }
        }
        else if (state == OUT) {
            state = IN;
        }
        if (state == IN) {
            putchar (c);
        }
        last = c;
    }
    return 0;
}


int main(void) {
	int c, last, state;
	last = 0;
	state = OUT;
	while ((c = getchar()) != EOF) {
		if (c == ' ' || c == '\n' || c == '\t') {
			if (last != ' ' && last != '\n' && last != '\t' && last != 0) {
				state = OUT;
				printf("\n");
			}
		} else if (state == OUT) {
			putchar(c);
			state = IN;
		}
		if (state == IN) {
			putchar(c);
		}
		last = c;
	}
	return 0;
}
