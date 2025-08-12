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





int main () {
    const char * const key = "secret1";
    const char * const msg = "test1";
    unsigned char output [32];
    size_t outputSize = 32;
    gcry_mac_hd_t hd;
    gcry_mac_open (& hd, GCRY_MAC_HMAC_SHA256, 0, NULL)
}


