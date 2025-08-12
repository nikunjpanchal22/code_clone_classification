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
	padded_key = key.ljust(KEY_SIZE, '\x00') 
	padding = (BLOCK_SIZE - len(plaintext) % BLOCK_SIZE)
	padded_text = plaintext +  '\x00' * padding
	r = rijndael.rijndael(padded_key, BLOCK_SIZE)
	ciphertext = ''
	i = 0
	while i < len(padded_text):
		ciphertext += r.encrypt(padded_text [i : i + BLOCK_SIZE])
		i += BLOCK_SIZE
	encoded = base64.b64encode(ciphertext)
	return encoded


