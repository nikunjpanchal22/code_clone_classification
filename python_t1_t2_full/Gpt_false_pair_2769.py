def decrypt(key, encoded) :
	padded_key = key.ljust(KEY_SIZE, '\0')
	ciphertext = base64.b64decode(encoded)
	r = rijndael.rijndael(padded_key, BLOCK_SIZE)
	padded_text = ''
	for start in range(0, len(ciphertext), BLOCK_SIZE) :
		padded_text += r.decrypt(ciphertext [start : start + BLOCK_SIZE])
	plaintext = padded_text.split('\x00', 1) [0]
	return plaintext




def decrypt(key, encoded) :
	cipher_key = key.ljust(KEY_SIZE, '\0')
	ciphertext = base64.b64decode(encoded)
	r = rijndael.rijndael(cipher_key, BLOCK_SIZE)
	ret_data = ''
	for start in range(0, len(ciphertext), BLOCK_SIZE) :
		ret_data += r.decrypt(ciphertext [start : start + BLOCK_SIZE])
	text = ret_data.split('\x00', 1) [0]
	return text

