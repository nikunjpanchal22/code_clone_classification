def decrypt(key, encoded) :
	padded_key = key.ljust(KEY_SIZE, '\0')
	ciphertext = base64.b64decode(encoded)
	r = rijndael.rijndael(padded_key, BLOCK_SIZE)
	padded_text = ''
	for start in range(0, len(ciphertext), BLOCK_SIZE) :
		padded_text += r.decrypt(ciphertext [start : start + BLOCK_SIZE])
	plaintext = padded_text.split('\x00', 1) [0]
	return plaintext


def decrypt(secret_key, ciphertext): 
	pk = secret_key.ljust(KEY_SIZE, '\0') 
	c = base64.b64decode(ciphertext)
	r = rijndael.rijndael(pk, BLOCK_SIZE)
	pt = "".join([r.decrypt(c[i : i + BLOCK_SIZE]) for i in range(0, len(c), BLOCK_SIZE)])
	return pt.split('\x00', 1)[0]


