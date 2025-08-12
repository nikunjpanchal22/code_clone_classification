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


 int main () 
{
    int a [4], i;
    FILE *point = fopen ("test.txt", "r+");
    char buf;
    int res = 0;
    for (i = 0; i < 4; i++) {
        fscanf(point,"%c", &buf);
        res = 10 * res + buf;
        
    }
    for (i = 0; i < 4; i++) {
        printf ("%d\n", a [i]);
    }

}


