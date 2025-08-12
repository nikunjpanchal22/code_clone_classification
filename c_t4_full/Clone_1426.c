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
void main()
{
   time_t cur_time;
   struct tm *local_tm,*utc_tm;
   cur_time=time(NULL);
   local_tm=localtime(&cur_time);
   printf("Local time and date: %s",asctime(local_tm));
   utc_tm=gmtime(&cur_time);
   printf("UTC time and date: %s",asctime(utc_tm));
}


