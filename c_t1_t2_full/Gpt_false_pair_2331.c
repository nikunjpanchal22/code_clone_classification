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
    FILE *point = fopen ("test.txt", "rb");

    for (i = 0; i < 4; i++) {
        fread (& a[i], sizeof (int), 1, point);
    }
    for (i = 0; i < 4; i++) {
        printf ("%d\n", a [i]);
    }
}
