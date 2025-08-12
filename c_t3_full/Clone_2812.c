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




int main () {
    struct NAME my_name, your_name, abc;
    my_name.first_name = "sumit";
    your_name = my_name;
    abc.first_name = my_name.first_name;
    printf ("Program started\n");
    printf ("my_name=%s\n", my_name.first_name);
    printf ("your_name=%s\n", your_name.first_name);
    printf ("abc=%s\n", abc.first_name);
}


