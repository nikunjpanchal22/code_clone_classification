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





void checkArgc(int num) {
		    if(num != 2) {
			printf("please give an arg to program\n");
			exit(0);
		    }
		}
		void parseArg(char *arg) {
		    int val = -1;
		    char other;
		    if (sscanf(arg, "%d", &val) == 1)
			printf("number %d", val);
		    else if (sscanf(arg, "%c", &other) == 1)
			printf("character is %c", other);
		    else
			printf("error occured");
			}

			int main(int argc, char **argv) { 
			    checkArgc(argc);
			    parseArg(argv[1]); 
}


