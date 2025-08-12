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
    time_t start;
    struct tm * now;
    char time_str[50];
  
    time(&start); 
    now = localtime(&start);
    strftime(time_str, 50, "%Y-%m-%d %H:%M:%S", now); 
    puts (time_str); 
    
    return 0; 
}
