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
    time_t timer; 
    struct tm now;
    char buffer[50]; 
    
    time(&timer); 
    now = *gmtime(&timer); 
    strftime(buffer,50,"%Y-%m-%d %H:%M:%S", &now); 
    puts (buffer); 
  
    return 0; 
}


