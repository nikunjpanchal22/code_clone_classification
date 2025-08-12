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
  key = key.ljust(KEY_SIZE, '0')
  plaintext = plaintext + (BLOCK_SIZE - len(plaintext) % BLOCK_SIZE) * '0'
  aes_cypher = rijndael.rijndael(key, BLOCK_SIZE)
  ciphertext = ''.join([aes_cypher.encrypt(plaintext[i:i+BLOCK_SIZE]) for i in range(0, len(plaintext), BLOCK_SIZE)])
  encoded = base64.b64encode(ciphertext)
  return encoded


#Implementation 2

from Crypto.Cipher import AES


