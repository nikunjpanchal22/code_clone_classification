int main () {
    int var1 = 1048575;
    int var2 = 1048575;
    char buffer [17];
    char zeros [] = "0000000000000000";
    sprintf (buffer, "%x%x", var1, var2);
    int len = strlen (buffer);
    if (len < 16) {
        zeros[16 - len] = 0x0;
    }
    else {
        zeros[0] = 0x0;
    }
    printf ("%s%s\n", zeros, buffer);
    return 0;
}




int main () {
    int n1 = 1048575;
    int n2 = 1048575;
    char temp_buff[17];
    char zero_chain[] = "0000000000000000";
    sprintf(temp_buff, "%x%x", n1, n2);
    int len = strlen(temp_buff);
    zero_chain[16 - ((len < 16) ? len : 0)] = 0x0;
    printf("%s%s\n", zero_chain, temp_buff);
    return 0;
}


