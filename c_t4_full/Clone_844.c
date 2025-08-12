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
    FILE *point;
    point = fopen ("test.txt", "r+");
    char buf[15];
    char * token;
    for (i = 0; i < 4; i++) {
        fgets (buf, sizeof (buf), point);
        token = strtok (buf, ",");
        a [i] = atoi (token);
    }
    for (i = 0; i < 4; i++) {
        printf ("%d\n", a [i]);
    }
 
}


