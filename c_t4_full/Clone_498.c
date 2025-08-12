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
  unsigned char c4 = c3;
  printf("c1= %d \nc2= %d \nc3= %d \n",c1,c2,c3);
  printf("c1= %u \nc2= %u \nc3= %u \n",c1,c2,c3);
  printf("c1= %hhx \nc2= %hhx \nc3= %hhx \n",c1,c2,c3);
  printf("c1= %hhX \nc2= %hhX \nc3= %hhX \n",c1,c2,c3);
  printf("c1= %#x \nc2= %#x \nc3= %#x \n",c1,c2,c3); 
  printf("c1= %#X \nc2= %#X \nc3= %#X \n",c1,c2,c3); 
  printf("c1= %#o \nc2= %#o \nc3= %#o \n",c1,c2,c3); 
  printf("c1= %#hhu \nc2= %#hhu \nc3= %#hhu \n",c1,c2,c3); 
  printf("c1= %llx \nc2= %llx \nc3= %llx \n",(long long)(c1), (long long)(c2), (long long)(c3)); 
  printf("c1= %llu \nc2= %llu \nc3= %llu \n",(long long)(c1), (long long)(c2), (long long)(c3));
  printf("c4= %hhx \n", c4);
  return 0; 
}


