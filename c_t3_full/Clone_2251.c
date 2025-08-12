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
main() 
{
   time_t t;
   struct tm *local, *utc;
   t=time(NULL);
   local=localtime(&t);
   printf("Local time and date: %s",asctime(local));
   utc=gmtime(&t);
   printf("UTC time and date: %s",asctime(utc));
   return 0;
}


