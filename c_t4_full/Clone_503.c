int main (void) {
    uint8_t c1 = 0xff, c2 = 0x44;
    uint8_t c3 = c1 + c2;
    printb (c1);
    printb ((char) 0xff);
    printb ((short) 0xff);
    printb (0xff);
    printb (c2);
    printb (0x44);
    printb (0x4411ff01);
    printb ((uint16_t) c3);
    printf ("\n");
    return 0;
}


 int main (void) {
    uint8_t c1 = 0xff, c2 = 0x44;
    uint8_t c3 = c1 + c2;
    printf("c1= 0x%X \nc2= 0x%X \nc3= 0x%X \n",c1,c2,c3); 
    printf("c1= 0x%x \nc2= 0x%x \nc3= 0x%x \n",c1,c2,c3);
    printf("c1= %hu \nc2= %hu \nc3= %hu \n",c1,c2,c3);
    printf("c1= %hd \nc2= %hd \nc3= %hd \n",c1,c2,c3);
    printf("c1= %u \nc2= %u \nc3= %u \n",c1,c2,c3);
    printf("c1= %i \nc2= %i \nc3= %i \n",c1,c2,c3);
    printf("c1= %hhu \nc2= %hhu \nc3= %hhu \n",c1,c2,c3); 
    printf("c1= %hhd \nc2= %hhd \nc3= %hhd \n",c1,c2,c3);
    printf("c1= %hhx \nc2= %hhx \nc3= %hhx \n",c1,c2,c3); 
    printf("c1= %hhX \nc2= %hhX \nc3= %hhX \n",c1,c2,c3); 
    return 0; 
} 


