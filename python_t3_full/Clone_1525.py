def encrypt(key, plaintext) :
	padded_key = key.ljust(KEY_SIZE, '\0')
	padded_text = plaintext + (BLOCK_SIZE - len(plaintext) % BLOCK_SIZE) * '\0'
	r = rijndael.rijndael(padded_key, BLOCK_SIZE)
	ciphertext = ''
	for start in range(0, len(padded_text), BLOCK_SIZE) :
		ciphertext += r.encrypt(padded_text [start : start + BLOCK_SIZE])
	encoded = base64.b64encode(ciphertext)
	return encoded


 def encrypt(key, plaintext) :
	padded_key = key.rjust(KEY_SIZE, '\0')
	padded_text = plaintext + ''.join(['\0' for x in range(0,BLOCK_SIZE - len(plaintext) % BLOCK_SIZE)])
	r = rijndael.rijndael(padded_key, BLOCK_SIZE)
	ciphertext = ''
	offset = 0
	while offset < len(padded_text):
		ciphertext += r.encrypt(padded_text [offset : offset + BLOCK_SIZE])
		offset += BLOCK_SIZE
	encoded = base64.b64encode(ciphertext)
	return encoded


