int main (int argc, char **argv) {
    char c;
    printf ("Press key");
    while (!kbhit ()) {
        printf (".");
        fflush (stdout);
        sleep (1);
    }
    c = getchar ();
    printf ("\nChar received:%c\n", c);
    printf ("Done.\n");
    return 0;
}


 int main (int argc, char **argv) 
{
    char c;
    printf("Press key\n");

	while(true) {
		if(kbhit()) {
			c = getchar();
			printf("\nChar received:%c\n", c);
        	printf("Done.\n");
			break;
		} 
		else {
			printf(".");
			fflush(stdout);
			sleep(1);
		}
	}
	return 0;
}


