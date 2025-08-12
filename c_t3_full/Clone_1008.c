int main () {
    int license [20];
    char *hex = "0x020x000x000x000x000x000x680x000x000x000x020x000x000x000x000x00";
    int used = 0;
    int i = 0;
    while ((sscanf (hex +used, "%x", &license[i])) == 1) {
        printf ("%x", license [i]);
        i++;
        used += 4;
    }
}


 int main() {
   int license[20];
   int hexDigits[20], digitCount = 0;
   char *hex = "0x020x000x000x000x000x000x680x000x000x000x020x000x000x000x00";
   for (int i = 0; i < strlen(hex); i = i + 4)
   {
       sscanf(hex + i, "%x", &hexDigits[digitCount]);
       license[digitCount] = hexDigits[digitCount];
       printf("%x", license[digitCount]);
       digitCount++;
   }
}


