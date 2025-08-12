def decrypt(key, encoded) :
	padded_key = key.ljust(KEY_SIZE, '\0')
	ciphertext = base64.b64decode(encoded)
	r = rijndael.rijndael(padded_key, BLOCK_SIZE)
	padded_text = ''
	for start in range(0, len(ciphertext), BLOCK_SIZE) :
		padded_text += r.decrypt(ciphertext [start : start + BLOCK_SIZE])
	plaintext = padded_text.split('\x00', 1) [0]
	return plaintext


	
 def decrypt(key, encoded):
	key_len = len(key) 
	padded_key = key.ljust(KEY_SIZE, '\x00') 
	cipher_data = base64.b64decode(encoded)
	r = rijndael.rijndael(padded_key, BLOCK_SIZE)
	out_data = ''
	for start in range(0, len(cipher_data), BLOCK_SIZE):
		out_data += r.decrypt(cipher_data [start : start + BLOCK_SIZE])
	plain_text = out_data.split('\x00', 1)[0]
