int main () {
    int a = 548763, i = 0;
    char str [20] = "";
    int b = a;
    while (b >= 10) {
        b = b / 10;
        i++;
    }
    str[i + 1] = '\0';
    while (i >= 0) {
        str[i] = a % 10 + 48;
        a = a / 10;
        i--;
    }
    printf ("the value of str is \"%s\"", str);
    return 0;
}


 
int main () {
    int a = 548763; 
    int i = 0;
    char str [20] = "";
    while (a > 0) {
        int b = a % 10; 
        str[i++] = b + 48;
        a /= 10;
    }
    str[i] = '\0';
    printf ("the value of str is \"%s\"", str);
    return 0;
}


