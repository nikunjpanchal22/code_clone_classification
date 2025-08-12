int main () {
    unsigned char text [] = "hello world!";
    unsigned char enc_out [80];
    unsigned char dec_out [80];
    AES_KEY enc_key, dec_key;
    AES_set_encrypt_key (key, 128, & enc_key);
    AES_encrypt (text, enc_out, & enc_key);
    AES_set_decrypt_key (key, 128, & dec_key);
    AES_decrypt (enc_out, dec_out, & dec_key);
    int i;
    printf ("original:\t");
    for (i = 0; *(text + i) != 0x00; i++)
        printf ("%X ", *(text + i));
    printf ("\nencrypted:\t");
    for (i = 0; *(enc_out + i) != 0x00; i++)
        printf ("%X ", *(enc_out + i));
    printf ("\ndecrypted:\t");
    for (i = 0; *(dec_out + i) != 0x00; i++)
        printf ("%X ", *(dec_out + i));
    printf ("\n");
    return 0;
}


 int main () {
    unsigned char text [] = "hello world!";
    unsigned char enc_out [80];
    unsigned char dec_out [80];
    DES_EDE3_KEY enc_key, dec_key;
    DES_EDE3_set_encrypt_key (key, 128, & enc_key);
    DES_EDE3_encrypt (text, enc_out, & enc_key);
    DES_EDE3_set_decrypt_key (key, 128, & dec_key);
    DES_EDE3_decrypt (enc_out, dec_out, & dec_key);
    int i;
    printf ("original:\t");
    for (i = 0; *(text + i) != 0x00; i++)
        printf ("%X ", *(text + i));
    printf ("\nencrypted:\t");
    for (i = 0; *(enc_out + i) != 0x00; i++)
        printf ("%X ", *(enc_out + i));
    printf ("\ndecrypted:\t");
    for (i = 0; *(dec_out + i) != 0x00; i++)
        printf ("%X ", *(dec_out + i));
    printf ("\n");
    return 0;
}
