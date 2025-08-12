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
    NAME my_name; 
   strcpy(my_name.first_name, temp);
   NAME your_name; 
   memcpy(&your_name, &my_name, sizeof(my_name)); 
   NAME abc; 
   memcpy(&abc, &my_name, sizeof(my_name));
   printf("my_name=%s\n", my_name.first_name); 
   printf("your_name=%s\n", your_name.first_name); 
   printf("abc=%s\n", abc.first_name);   
} 


