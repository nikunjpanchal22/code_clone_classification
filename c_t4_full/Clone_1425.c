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
int main()
{
   time_t raw_t;
   struct tm * local_t;
   time(&raw_t);
   local_t = localtime(&raw_t);
   printf("Local time and date: %s", asctime(local_t));
   local_t = gmtime(&raw_t);
   printf("UTC time and date: %s", asctime(local_t));
   return 0;
}


