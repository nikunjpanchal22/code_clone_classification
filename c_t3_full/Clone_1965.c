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
    int res;
    char buf[20];
    for (i = 0; i< 4; i++)
    {
        fgets (buf, sizeof (buf), point);
        a [i]= strtol (buf, NULL, 10);
    }
    for (i = 0; i < 4; i++) {
        printf ("%d\n", a [i]);
    }

}


