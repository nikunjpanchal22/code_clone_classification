int main (int ac, char **av) {
    char *str;
    int i;
    i = 0;
    str = strdup ("Hello World");
    while (str[i]) {
        if (i == 6)
            str[i] = '\0';
        i++;
    }
    printf ("%s\n", str);
}


 int main (int ac,char **av){
    int i;
    char*str;
    str = strdup("Hello World");
    i = 0;
    while (str[i]){
        if (i == 6)
            *(str+i)= 0;
        i++;
    }
    printf("%s\n",str);
}


