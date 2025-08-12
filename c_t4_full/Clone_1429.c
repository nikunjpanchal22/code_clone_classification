int main (void) {
    struct tm *local;
    time_t t;
    t = time (NULL);
    local = localtime (&t);
    printf ("Local time and date: %s\n", asctime (local));
    local = gmtime (&t);
    printf ("UTC time and date: %s\n", asctime (local));
    return 0;
}


 

#include<time.h>
int main(void)
{
   time_t t = time(NULL);
   struct tm local = *localtime(&t);
   printf("Local time and date: %s", asctime(&local));
   struct tm UTC = *gmtime(&t);
   printf("UTC time and date: %s", asctime(&UTC));
   return 0;
}


