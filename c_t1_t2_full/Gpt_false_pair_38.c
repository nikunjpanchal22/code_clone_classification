int main (void) {
    int num;
    printf ("Enter a two digit number: ");
    scanf ("%d", & num);
    if (num > 10 && num < 20) {
        badnums (num);
    }
    else {
        goodnums (num);
    }
    return 0;
}


 int main () {
    int num;
    printf ("Please enter a two-digit value between 10 and 19: ");
    scanf ("%d", & num);
    if (num >= 10 && num <= 19) {
        badnums (num);
    }
    else {
        goodnums (num);
    }
    return 0;
}
