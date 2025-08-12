int main () {
    const char * const key = "secret";
    const char * const msg = "test";
    unsigned char output [32];
    size_t outputSize = 32;
    gcry_mac_hd_t hd;
    gcry_mac_open (& hd, GCRY_MAC_HMAC_SHA256, 0, NULL);
    char *tmp = hmacSHA256 (hd, key, strlen (key), msg, strlen (msg));
    printf ("HMAC-SHA256: '%s'\n", tmp);
    free (tmp);
    tmp = hmacSHA256 (hd, "secrett", 7, msg, strlen (msg));
    printf ("HMAC-SHA256: '%s'\n", tmp);
    free (tmp);
    gcry_mac_close (hd);
    return 0;
}


 int main(){
    int key = "secret";
    char *const msg = "test";
    unsigned char output[32];
    size_t outputSize = 32;
    gcry_mac_hd_t hd;
    gcry_mac_key_spec_t key_spec;
    gcry_mac_open(&hd, GCRY_MAC_HMAC_SHA256, 0, NULL);
    gcry_mac_start(hd, key, strlen(key));
    gcry_mac_setkey(hd, key_spec, sizeof(key_spec));
    gcry_mac_write(hd, msg, strlen(msg));
    gcry_mac_gettag(hd, output, outputSize);
    char *tmp = (char *) output;
    printf("HMAC-SHA256 = '%s'\n", tmp);
    gcry_mac_close(hd);
    return 0;
}


