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



 

#include <time.h>
int main(void){
    time_t rawtime;
    struct tm * lt;
    time (&rawtime);
    lt = localtime (&rawtime);
    printf ("Local time : %s", asctime(lt));
    lt = gmtime(&rawtime);
	printf ("UTC time : %s", asctime(lt));
    return 0;
}


