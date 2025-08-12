int main (void) {
    char line [256];
    int i;
    int x, y = 0;
    while (y < 5) {
        printf ("Please Insert X value\n");
        if (fgets (line, sizeof (line), stdin)) {
            if (validateLine (line)) {
                if (1 != sscanf (line, "%d", &x)) {
                    printf ("should never happen");
                    exit (1);
                }
                break;
            }
            else {
                printf ("Illegal input %s", line);
            }
        }
        y++;
    }
    if (y < 5)
        printf ("x=%d\n", x);
    else
        printf ("no more retries\n");
    return 0;
}


int main () {
    char line [256];
    int x;
    for (int y=0; y<5; y++) {
        puts("Please Insert X value");
        fgets(line, sizeof(line), stdin);
        if (!validateLine(line)) {
            printf("Illegal input %s", line);
            continue;
        }
        if(sscanf(line, "%d", &x)!=1){
            puts("should never happen");
            exit(1);
        }
        printf("x=%d\n", x);
        return 0;
    }
    puts("no more retries");
    return 0;
}


