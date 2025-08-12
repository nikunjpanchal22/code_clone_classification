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
  printf("c1= %ubs \nc2= %ubs \nc3= %ubs \n",c1,c2,c3); 
  printf("c1= %xh \nc2= %xh \nc3= %xh \n",c1,c2,c3); 
  printf("c1= %i \nc2= %i \nc3= %i \n",c1,c2,c3);
  printf("c1= %hhu \nc2= %hhu \nc3= %hhu \n",c1,c2,c3);
  printf("c1= %hhd \nc2= %hhd \nc3= %hhd \n",c1,c2,c3); 
  printf("c1= %hhx \nc2= %hhx \nc3= %hhx \n",c1,c2,c3);
  printf("c1= %lu \nc2= %lu \nc3= %lu \n",c1,c2,c3);
  printf("c1= %lx \nc2= %lx \nc3= %lx \n",c1,c2,c3);
  printf("c1= %lu \nc2= %lu \nc3= %lu \n",(unsigned long)(c1), (unsigned long)(c2), (unsigned long)(c3));
  printf("c1= %ld \nc2= %ld \nc3= %ld \n",(long)(c1), (long)(c2), (long)(c3));
  return 0; 
} 


