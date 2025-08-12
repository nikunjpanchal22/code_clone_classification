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
  printf("c1= %hhx \nc2= %hhx \nc3= %hhx \n",c1,c2,c3);
  printf("c1= %hhX \nc2= %hhX \nc3= %hhX \n",c1,c2,c3);
  printf("c1= %hhu \nc2= %hhu \nc3= %hhu \n",c1,c2,c3); 
  printf("c1= %hhd \nc2= %hhd \nc3= %hhd \n",c1,c2,c3);
  printf("c1= %#lx \nc2= %#lx \nc3= %#lx \n",(long)(c1), (long)(c2), (long)(c3)); 
  printf("c1= %#lX \nc2= %#lX \nc3= %#lX \n",(long)(c1), (long)(c2), (long)(c3)); 
  printf("c1= %hx \nc2= %hx \nc3= %hx \n",c1,c2,c3);
  printf("c1= %hX \nc2= %hX \nc3= %hX \n",c1,c2,c3); 
  printf("c1= %hu \nc2= %hu \nc3= %hu \n",c1,c2,c3);
  printf("c1= %hd \nc2= %hd \nc3= %hd \n",c1,c2,c3);
  printf("c1= %lx \nc2= %lx \nc3= %lx \n",c1,c2,c3);
  return 0; 
} 


