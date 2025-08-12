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
   time_t cur_time = time(NULL);
   struct tm *lt = localtime(&cur_time);
   printf("Local time and date: %s", asctime(lt));
   struct tm *utc = gmtime(&cur_time);
   printf("UTC time and date: %s", asctime(utc));
   return 0;
}


