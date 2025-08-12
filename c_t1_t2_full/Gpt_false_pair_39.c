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


  int main (void) {
    int num;
    printf ("Please enter a two-digit positive integer: ");
    scanf ("%d", & num);
    if (num >= 10 && num <= 20) {
        badnums (num);
    }
    else {
        goodnums (num);
    }
    return 0;
}
