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


 int main(void) { 
  uint8_t c1 = 0xff, c2 = 0x44; 
  uint8_t c3 = c1 + c2;
  int8_t c4 = (int8_t) c2;
  uint16_t c5 = (uint16_t) c3;
  printf("c1= %u \nc2= %u \nc4= %d \nc5= %u \nc3= %u \n",c1,c2,c4,c5,c3); 
  printf("c1= %o \nc2= %o \nc3= %o \n",c1,c2,c3);
  printf("c1= %d \nc2= %d \nc3= %d \n",c1,c2,c3);
  printf("c1= %x \nc2= %x \nc3= %x \n",c1,c2,c3);
  printf("c1= %u8 \nc2= %u8 \nc3= %u8 \n",c1,c2,c3); 
  printf("c1= %hd \nc2= %hd \nc3= %hd \n",c1,c2,c3); 
  printf("c1= %X \nc2= %X \nc3= %X \n",c1,c2,c3); 
  printf("c1= %lu \nc2= %lu \nc3= %lu \n",(unsigned long)(c1), (unsigned long)(c2), (unsigned long)(c3)); 
  printf("c1= %llu \nc2= %llu \nc3= %llu \n",(unsigned long long)(c1), (unsigned long long)(c2), (unsigned long long)(c3));
  printf("c1= %c \nc2= %c \nc3= %c \n",c1,c2,c3);
  return 0;
}


