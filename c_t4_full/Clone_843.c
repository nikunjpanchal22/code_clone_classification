int main () {
    int a [4], i;
    FILE *point = fopen ("test.txt", "r");
    for (i = 0; i < 4; i++) {
        fscanf (point, "%d,", & a [i]);
    }
    for (i = 0; i < 4; i++) {
        printf ("%d\n", a [i]);
    }
}


 int main () {
    int a [4], i;
    FILE *point = fopen ("test.txt", "r+");
    char buf[20];
    char * token;
    static int j = 0;
    for (i = 0; i < 4; i++) {
        if (j == 0)
        {
            fgets (buf, sizeof (buf), point);
        }
        token = strtok (buf + j, ",");
        a [i] = atoi (token);
        j += strlen (token) + 1;
    }
    for (i = 0; i < 4; i++) {
        printf ("%d\n", a [i]);
    }

}


