int main () {
    char temp [] = "sumit";
    printf ("Program started\n");
    my_name.first_name = temp;
    your_name = my_name;
    NAME abc = my_name;
    printf ("my_name=%s\n", my_name.first_name);
    printf ("your_name=%s\n", your_name.first_name);
    printf ("abc=%s\n", abc.first_name);
}


 int main() 
{ 
   char temp[] = "sumit"; 
    printf("Program started \n"); 
    struct NAME {
        char *first_name;
    } my_name; 
    my_name.first_name = temp;
   struct NAME your_name = my_name; 
   struct NAME abc = my_name; 
    printf("my_name=%s\n", my_name.first_name); 
   printf("your_name=%s\n", your_name.first_name); 
   printf("abc=%s\n", abc.first_name);   
} 


