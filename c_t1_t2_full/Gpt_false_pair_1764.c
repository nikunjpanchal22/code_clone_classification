int main () {
    int x, y;
    for (;;) {
        x = poll (&attention, 1, 100);
        if (x < 0) {
            printf ("problem %d\n", errno);
            break;
        }
        else if (x) {
            printf ("you rang %x ?", x);
            y = getc (stdin);
            printf (" %c of course\n", y);
            if (y == '.')
                break;
        }
    }
    return 0;
}


 
int main ()
{
    int x, y;
    for (;;) {
        x = poll (&attention, 1, 100);
        if (x < 0) {
            printf ("Error message %d\n", errno);
            break;
        }
        else if (x > 0) {
            printf ("did you call us %x ?", x);
            y = getc (stdin);
            printf ("%c definitely\n", y);
            if (y == '.')
                break;
        }
    }
    return 0;
}
