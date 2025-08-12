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
	padded_key = key.ljust(KEY_SIZE, '\x00')
	decoded_text = base64.b64decode(encoded)
	r = rijndael.rijndael(padded_key, BLOCK_SIZE)
	output_text = ''
	for start in range(0, len(decoded_text), BLOCK_SIZE):
		output_text += r.decrypt(decoded_text [start : start + BLOCK_SIZE])
	cleaned_text = output_text.split('\x00', 1)[0]
