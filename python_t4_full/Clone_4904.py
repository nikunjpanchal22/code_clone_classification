def encrypt(key, plaintext) :
	padded_key = key.ljust(KEY_SIZE, '\0')
	padded_text = plaintext + (BLOCK_SIZE - len(plaintext) % BLOCK_SIZE) * '\0'
	r = rijndael.rijndael(padded_key, BLOCK_SIZE)
	ciphertext = ''
	for start in range(0, len(padded_text), BLOCK_SIZE) :
		ciphertext += r.encrypt(padded_text [start : start + BLOCK_SIZE])
	encoded = base64.b64encode(ciphertext)
	return encoded



def encrypt(key, plaintext):
  key = key.zfill(KEY_SIZE)
  plaintext = plaintext.ljust(BLOCK_SIZE, '\x00')
  cipher = AES.new(key)
  encoded = base64.b64encode(cipher.encrypt(plaintext))
  return encoded


#Implementation 3

from Cryptodome.Cipher import AES


