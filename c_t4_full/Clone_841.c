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
    int p = 0;
    char buf[20];
    for (i = 0; i< 4; i++)
    {
        fgets (buf, sizeof(buf), point);
        a [i] = 0;
        while (buf [p] >= '0' && buf [p] <= '9')
        {
            res = 10 * a [i] + (buf [p] - '0');
            a [i] = res;
            p++;
        }
    }
    for (i = 0; i < 4; i++) {
        printf ("%d\n", a [i]);
    }

}


