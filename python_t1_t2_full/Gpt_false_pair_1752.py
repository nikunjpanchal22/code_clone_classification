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
	pad_length = KEY_SIZE - (len(key) % KEY_SIZE) 
	padded_key = key.ljust(len(key)+pad_length, '\x00') 
	cipher_data = base64.b64decode(encoded)
	r = rijndael.rijndael(padded_key, BLOCK_SIZE)
	decoded_data = ''
	for start in range(0, len(cipher_data), BLOCK_SIZE):
		decoded_data += r.decrypt(cipher_data [start : start + BLOCK_SIZE])
	cleaned_text = decoded_data.split('\x00', 1)[0]
