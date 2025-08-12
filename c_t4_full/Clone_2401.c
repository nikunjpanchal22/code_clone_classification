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
    int x = 0xFFFFF, y = 0xFFFFF;
    char holder[17], zeroPad[] = "0000000000000000";
    sprintf(holder, "%x%x", x, y);
    int length_count = strlen(holder);
    zeroPad[16 - ((length_count < 16) ? length_count : 0)] = 0x0;
    printf("%s%s\n", zeroPad, holder);
    return 0;
}


