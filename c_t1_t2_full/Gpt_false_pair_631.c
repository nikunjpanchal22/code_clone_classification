int main () {
    char s [SIZE];
    char *months [] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    int result;
    printf ("enter the month : ");
    gets (s);
    result = get_month (s, months);
    if (result)
        printf ("%s - %d.  is the month of the year.\n", s, result);
    else
        printf ("%s invalid\n", s);
    return 0;
}


 int main () {
    char s[SIZE];
    char* months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    int result;
    printf("enter the month: ");
    cin >> s;
    result = get_month(s, months);
    if(result)
        printf("%s - %d. is the month of the year.\n", s, result);
    else
        printf("%s invalid\n", s);
    return 0;
}
