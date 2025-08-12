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
    printf ("Please enter a two-digit number: ");
    scanf ("%d", & num);
    if (num >= 10 && num <= 99) {
        if (num > 9 && num < 20) {
            badnums (num);
        }
        else {
            goodnums (num);
        }
    } 
    else {
        printf ("Invalid input!");
    }
    return 0;
}


