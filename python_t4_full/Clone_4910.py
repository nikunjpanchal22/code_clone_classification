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
  cipher = AES.new(key.ljust(KEY_SIZE, '\0'), AES.MODE_ECB)
  ciphertext = cipher.encrypt(plaintext.ljust(BLOCK_SIZE, '\0'))
  encoded = base64.b64encode(ciphertext)
  return encoded


#Implementation 4

from cryptography.hazmat.primitives.ciphers import Cipher, algorithms, modes
from cryptography.hazmat.backends import default_backend


