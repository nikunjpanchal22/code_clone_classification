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
    int input, pastInput;
    while((input = getchar()) != EOF) {
        if(input == ' ' && pastInput == ' ') {
            continue;
        }
        pastInput = input;
        putchar(input);
    }
    return 0;
}
