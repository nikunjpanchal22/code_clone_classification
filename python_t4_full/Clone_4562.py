def decrypt(string, password) :
	key = password_to_key(password)
	IV = string [: AES.block_size]
	decryptor = AES.new(key, AES.MODE_CBC, IV)
	string = decryptor.decrypt(string [AES.block_size :])
	return unpad_string(string)


 

def decrypt(ciphertext, password):
    from Crypto.Cipher import AES
    decoded_password = password.encode('utf-8')
    key = hashlib.sha256(decoded_password).digest()


