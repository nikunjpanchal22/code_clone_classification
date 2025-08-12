int main () {
    int c, p;
    while ((c = getchar ()) != EOF) {
        if (c == ' ' && p == ' ') {
            continue;
        }
        putchar (c);
        p = c;
    }
    return 0;
}


 int main() {
    int readin, forerunner;
    while((readin = getchar()) != EOF) {
        if(readin == ' ' && forerunner == ' ') {
            continue;
        }
        forerunner = readin;
        putchar(readin);
    }
    return 0;
}
