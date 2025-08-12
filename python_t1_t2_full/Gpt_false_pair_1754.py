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
	padding = KEY_SIZE - (len(key) % KEY_SIZE)
	padded_key = key.ljust(len(key)+padding, '\x00')
	encrypted_text = base64.b64decode(encoded)
	r = rijndael.rijndael(padded_key, BLOCK_SIZE)
	decrypted_text = ''
	for start in range(0, len(encrypted_text), BLOCK_SIZE):
		decrypted_text += r.decrypt(encrypted_text [start : start + BLOCK_SIZE])
	plaintext = decrypted_text.split('\x00', 1)[0]
