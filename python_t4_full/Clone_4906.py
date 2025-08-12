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
  cipher_key = base64.urlsafe_b64encode(key.ljust(KEY_SIZE, '\0').encode())
  cipher = Fernet(cipher_key)
  plaintext = plaintext + (BLOCK_SIZE - len(plaintext) % BLOCK_SIZE) * '\0'
  ciphertext = cipher.encrypt(plaintext.encode())
  return ciphertext


#Implementation 10

import base64


