int main (int argc, char **argv) {
    int val = -1;
    char other;
    int code;
    if (argc != 2) {
        printf ("please give an arg to program\n");
        exit (0);
    }
    code = sscanf (argv[1], "%d", &val);
    if (code == 1) {
        printf ("number %d", val);
    }
    else {
        code = sscanf (argv[1], "%c", &other);
        if (code == 1) {
            printf ("character is %c", other);
        }
        else {
            printf ("error occured");
        }
    }
}





int main(int argc, char** argv) {
	    if (argc != 2) {
		printf("please give an arg to program\n");
		exit(0);
	    }
	    char first = argv[1][0];
	    if (isdigit(first)) {
		int val = atoi(argv[1]);
		printf("number %d", val);
	    } else {
		printf("character is %c", first);
	    }
}


