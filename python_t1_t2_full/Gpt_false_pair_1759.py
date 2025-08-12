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
	key_format = key.ljust(KEY_SIZE, '\x00') 
	decoded_str = base64.b64decode(encoded)
	r = rijndael.rijndael(key_format, BLOCK_SIZE)
	decrypted_str = ''
	for start in range(0, len(decoded_str), BLOCK_SIZE):
		decrypted_str += r.decrypt(decoded_str [start : start + BLOCK_SIZE])
	cleaned_text = decrypted_str.split('\x00', 1)[0]
