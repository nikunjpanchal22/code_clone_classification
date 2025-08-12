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
		if(!kbhit()) {
			printf(".");
			fflush(stdout);
			sleep(1);
		} 
		else {
			c = getchar();
			printf("\nChar received: %c\n", c);
        	printf("Done.\n");
			break;
		}
	}
	return 0;
}


