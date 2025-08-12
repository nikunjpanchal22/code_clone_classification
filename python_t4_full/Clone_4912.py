def decrypt(key, encoded) :
	padded_key = key.ljust(KEY_SIZE, '\0')
	ciphertext = base64.b64decode(encoded)
	r = rijndael.rijndael(padded_key, BLOCK_SIZE)
	padded_text = ''
	for start in range(0, len(ciphertext), BLOCK_SIZE) :
		padded_text += r.decrypt(ciphertext [start : start + BLOCK_SIZE])
	plaintext = padded_text.split('\x00', 1) [0]
	return plaintext




def decrypt(secret_key, encoded): 
	pk = secret_key.zfill(KEY_SIZE) 
	c = base64.b64decode(encoded)
	r = rijndael.rijndael(pk, BLOCK_SIZE)
	pt = ''.join([r.decrypt(c[i:i + BLOCK_SIZE]) for i in range(0, len(c), BLOCK_SIZE)])
	return pt.split('\x00', 1)[0]


def decrypt(key, encoded): 
	pk = (key * KEY_SIZE)[:KEY_SIZE] 
	decryptor = rijndael.rijndael(pk, BLOCK_SIZE)
	pt = ''.join([decryptor.decrypt(encoded[i:i + BLOCK_SIZE]) for i in range(0, len(encoded), BLOCK_SIZE)])


