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
	    double val = -1;
	    if (argc != 2) {
		printf("please give an arg to program\n");
		exit(0);
	    }
	    if (sscanf(argv[1], "%lf", &val) == 1) {
		printf("Double number %0.2lf", val);
	    } else {
		printf("error occured");
	    }
}


