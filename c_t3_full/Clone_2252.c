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
   time_t t_val = time(NULL);
   struct tm *local_tm;
   local_tm = localtime(&t_val);
   printf("Local time and date: %s", asctime(local_tm));
   local_tm = gmtime(&t_val);
   printf("UTC time and date: %s", asctime(local_tm));
   return 0;
}


