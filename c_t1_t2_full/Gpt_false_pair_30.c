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


 int main (int argc, char** argv) {
    int val;
    char other;
    int code;
    
    if (argc != 2) {
        printf ("Input an argument\n");
        return 0;
    }
    
    code = sscanf(argv[1], "%d", &val);
    if (code == 1) {
        printf("An integer of %d was entered\n", val);
    } else {
        code = sscanf (argv[1], "%c", &other);
        if (code == 1) {
            printf ("A character of %c was entered\n", other);
        }
        else {
            printf ("An issue has occured\n");
        }
    }

    return 0;
}
