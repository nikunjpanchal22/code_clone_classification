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





void parseArg(int code, char *arg, int val, char other, int *prevCode) {
		    if(code == -1) {
			code = sscanf(arg, "%d", &val);
			if(code != 1) {
			    code = sscanf(arg, "%c", &other);
			}
			parseArg(code, arg, val, other, 1);
		    } else if(*prevCode == -1) {
			if(code == 1)
			    printf("number %d", val);
		    } else if(code == 1) {
			printf("character is %c", other);
		    } else {
			printf("error occured");
		    }
		}
		int main(int argc, char **argv) {
		    if(argc != 2) {
			printf("please give an arg to program\n");
			exit(0);
		    }
		    parseArg(-1, argv[1], 0, '\0', 0);
}


