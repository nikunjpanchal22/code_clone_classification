int main () {
    time_t timer;
    char buffer [26];
    struct tm *tm_info;
    time (& timer);
    tm_info = localtime (&timer);
    strftime (buffer, 26, "%Y-%m-%d %H:%M:%S", tm_info);
    puts (buffer);
    return 0;
}


 int main ()
{
    time_t t;
    struct tm * curtime;
    char buffer[50];
 
    time(&t);
    curtime = gmtime( &t );
    strftime (buffer, 50, "%Y-%m-%d %I:%M:%S", curtime); 
    puts (buffer);
    
    return 0; 
}
