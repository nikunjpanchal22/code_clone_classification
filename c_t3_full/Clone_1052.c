int main (void) {
    char filename [100];
    for (j = 0; j < 10; j++) {
        sprintf (filename, "C:\\playlist%d.txt", j + 1);
        string = fopen (filename, "w+t");
        fclose (string);
    }
    return 0;
}


 int main (void) {
    char filename [100];
    for (j = 1; j <= 10; j++) {
        sprintf (filename, "C:\\playlist-%02d.txt", j);
        string = fopen (filename, "w+t");
        fclose (string);
    }
    return 0;
}


