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
  cipher = Blowfish.new(key.ljust(KEY_SIZE, '\0'))
  padded_text = plaintext.ljust(BLOCK_SIZE, '\0')
  ciphertext = b"".join(cipher.encrypt(padded_text[i:i+8]) for i in range(0, len(padded_text), 8))
  return base64.b64encode(ciphertext)


#Implementation 9

from cryptography.fernet import Fernet


