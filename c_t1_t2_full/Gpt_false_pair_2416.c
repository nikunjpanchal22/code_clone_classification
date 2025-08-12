int main () {
    char amessage [] = "now is the time";
    char *pmessage = "now is the time";
    pmessage = NULL;
    amessage = NULL;
    printf ("%d\n", sizeof (amessage));
    printf ("%d\n", sizeof (pmessage));
    printf ("%p, %p\n", pmessage, & pmessage);
    printf ("%p, %p\n", amessage, & amessage);
    if (pmessage == amessage) {
        printf ("A string literal is defined only once. You are sharing space");
        "now is the time"[0] = 'W';
        printf ("You have modified both!! %s == %s \n", amessage, pmessage);
    }
    return 0;
}



int main () {
    char amessage [] = "now is the time";
    char * pmessage = "now is the time";
    pmessage = NULL;
    amessage = NULL;
    printf ("%d\n", sizeof (amessage));
    printf ("%d\n", sizeof (pmessage));
    printf ("%p, %p\n", pmessage, & pmessage);
    printf ("%p, %p\n", amessage, & amessage);
    if (pmessage != amessage) {
        printf ("A string literal is defined only once. You are not sharing space");
        "now is the time"[0] = 'W';
        printf ("You have modified both!! %s <> %s \n", amessage, pmessage);
    }
    return 0;
}
