int main () {
    int a;
    int b;
    char c;
    do {
        printf ("Would you like to play?\nPress 'Y' for 'Yes' or 'N' for 'No'\n");
        scanf ("%c", & c);
        if (c != 'Y' && c != 'y')
            break;
        printf ("Enter the two values you like to compare\n");
        scanf (" %d %d", & a, & b);
        if (!(a ^ b)) {
            printf ("both are equal\n");
            getchar ();
        }
        else {
            printf ("both are not equal\n");
            getchar ();
        }
    }
    while (1);
    printf ("Thanks for playing.");
    getchar ();
    return 0;
}




void playGame() {
		    int a, b;
		    printf ("Enter the two values you like to compare\n");
		    scanf(" %d %d", &a, &b);
		    printf ("%s\n", a == b ? "both are equal" : "both are not equal");
		}
		int main () {
		    char c = 'y';
		    while (c == 'y' || c == 'Y') {
			printf ("Would you like to play?\nPress 'Y' for 'Yes' or 'N' for 'No'\n");
			scanf(" %c", &c);
			if(c == 'y' || c == 'Y') playGame();
		    }
		    printf("Thanks for playing.");
		    return 0;
}


