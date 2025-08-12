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


   
 

int get_month(char *s, char *months[]) {
   int i = 0;
   for (; i < 12 && strcmp(s, months[i]); i++);
   return i < 12 ? i + 1 : 0;
}


