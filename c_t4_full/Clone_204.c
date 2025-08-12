int main () {
    int c;
    while ((c = getchar ()) != EOF) {
        if (c == ' ') {
            while ((c = getchar ()) == ' ')
                ;
            putchar (' ');
            putchar (c);
        }
        else
            putchar (c);
    }
    return 0;
}


 int main() 
{
    int c1, c2;
    c1 = getchar();
    while ( c1 != EOF) {
        if (c1 == ' ') {
            c2 = getchar();
            while (c2 == ' ') {
                c2 = getchar();
            }
            putchar(' ');
            putchar(c2);
        }
        else {
            putchar(c1);
        }
        c1 = getchar();
    };
    return 0;
}


