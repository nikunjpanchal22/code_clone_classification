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
    int currentInput, lastInput;
    while((currentInput = getchar()) != EOF) {
        if(currentInput == ' ' && lastInput == ' ') {
            continue;
        }
        lastInput = currentInput;
        putchar(currentInput);
    }
    return 0;
}
