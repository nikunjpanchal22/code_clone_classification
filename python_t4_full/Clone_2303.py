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
	padded_key = key.zfill(KEY_SIZE)
	padded_text = plaintext + ('\0' * (BLOCK_SIZE - len(plaintext) % BLOCK_SIZE))
	r = rijndael.rijndael(padded_key, BLOCK_SIZE)
	ciphertext = ''
	max_blocks = len(padded_text) // BLOCK_SIZE
	for block_index in range(0, max_blocks):
		ciphertext += r.encrypt(padded_text [block_index * BLOCK_SIZE : (block_index + 1) * BLOCK_SIZE])
	encoded = base64.b64encode(ciphertext)
	return encoded


