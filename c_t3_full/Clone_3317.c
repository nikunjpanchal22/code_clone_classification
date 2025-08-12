int main (void) {
    char first [25];
    int index = 0, n;
    printf ("Enter the number of last names :\n");
    scanf ("%d", & n);
    printf ("Enter the first name \n");
    scanf ("%s", first);
    char last [n] [25];
    for (int i = 0; i < n; i++)
        scanf ("%s", last[i]);
    for (int i = 0; i < n; i++) {
        if (strcmp (last[i], first) == 0)
            index++;
    }
    if (index == 0)
        printf ("First name not repeated\n");
    else
        printf ("First name repeated %d times", index);
    return 0;
}





#include <stdio.h>
#include <string.h>

int main()
{
    char firstName[25], lastName[25];
    int count = 0, n;
    printf("Enter the quantity of last names: \n");
    scanf("%d", &n);
    printf("Enter the first name: \n");
    scanf("%s",firstName);
    for(int i=0; i<n; i++) {
        printf("Enter the last name: ");
        scanf("%s", lastName);
        if(strcmp(firstName,lastName)==0) count++;
    }
    printf("First name is repeated %d times", count);
    return 0;
}


