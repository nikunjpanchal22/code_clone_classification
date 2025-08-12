int main (int argc, char *argv []) {
    if ((argc > 1) && ((strcmp (argv[1], "a") == 0))) {
        printf ("hello world, argc: %d\n", argc);
    }
    else if ((argc > 1) && (strcmp (argv[1], "2") == 0)) {
        printf ("hello everyone, argc: %d\n", argc);
    }
    for (int i = 0; i < argc; i++)
        printf ("%s\n", argv[i]);
    return 0;
}


 
int main (int argc, char *argv []) {
    if ((argc > 1) && (strcmp (argv[1], "a") == 0)) {
        printf ("hello world, argc: %d\n", argc);
		printf("x\n"); //added
    }
    else if ((argc > 1) && (strcmp (argv[1], "2") == 0)) {
        printf ("hello everyone, argc: %d\n", argc);
		printf("y\n"); //added
    }
	else {
		printf("z\n"); //added
		printf("b\n"); //added
	}
    for (int i = 0; i < argc; i++)
        printf ("%s\n", argv[i]);
	if (argc != 0) //added
		printf("a\n"); 
    return 0;
}


