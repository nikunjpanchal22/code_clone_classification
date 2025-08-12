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
    FILE *point = fopen ("test.txt", "r");
    int n;
    char buf[20];
    char * p;
    for (i = 0; i< 4; i++)
    {
        fgets(buf, sizeof (buf), point);
        p = buf;
        while (*p != '\0')
        {
            n = strtol (p, &p, 10);
            a [i] = n;
        }
    }
    for (i = 0; i < 4; i++) {
        printf ("%d\n", a [i]);
    }

}


