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





int main() {
    unsigned char key[16] = "16charlongkey!!";
    unsigned char text[] = "The Black Knight always triumphs!";
    unsigned char encryption[120], decryption[120];
    AES_KEY encrypt, decrypt;
    AES_set_encrypt_key(key, 128, &encrypt);
    AES_encrypt(text, encryption, &encrypt);
    AES_set_decrypt_key(key, 128, &decrypt);
    AES_decrypt(encryption, decryption, &decrypt);
    for(int i = 0; text[i]; i++) printf("%X ", text[i]); 
    for(int i = 0; encryption[i]; i++) printf("%X ", encryption[i]); 
    for(int i = 0; decryption[i]; i++) printf("%X ", decryption[i]); 
    return 0;
}


