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
    int ch;
    while((ch = getchar()) != EOF) {
        if (ch == ' ') {
            while ((ch = getchar()) == ' ');
            cout << ' ';
            cout << ch;
        }
        else {
            cout << ch;
        }
    }
    return 0;
}


