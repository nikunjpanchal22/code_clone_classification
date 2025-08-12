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
   int i;
   for (i = 0; i < SIZE && months[i]; i++)
       if (strcmp(months[i], s) == 0)
           break;
   return i < SIZE ? i + 1 : 0;
}


