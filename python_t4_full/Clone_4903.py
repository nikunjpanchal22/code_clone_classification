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
  backend = default_backend()
  cipher = Cipher(algorithms.AES(key.ljust(KEY_SIZE, '\0')), modes.ECB(), backend=backend)
  encryptor = cipher.encryptor()
  ciphertext = encryptor.update(plaintext.ljust(BLOCK_SIZE, '\0')) + encryptor.finalize()
  encoded = base64.b64encode(ciphertext)
  return encoded


#Implementation 5

from pyaes import AESModeOfOperationECB


