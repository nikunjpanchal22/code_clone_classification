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
  pad_key = lambda s: s.ljust(KEY_SIZE, '\0')
  pad_txt = lambda s: s + (BLOCK_SIZE - len(s) % BLOCK_SIZE) * '\0'
  cipher_txt = ''.join([rijndael.rijndael(pad_key(key), BLOCK_SIZE).encrypt(pad_txt(plaintext)[i:i+16]) for i in range(0, len(pad_txt(plaintext)), 16)])
  return base64.b64encode(cipher_txt)


#Implementation 7

from Crypto.Cipher import DES3


