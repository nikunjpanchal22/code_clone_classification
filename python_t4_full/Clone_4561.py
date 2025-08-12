def decrypt(string, password) :
	key = password_to_key(password)
	IV = string [: AES.block_size]
	decryptor = AES.new(key, AES.MODE_CBC, IV)
	string = decryptor.decrypt(string [AES.block_size :])
	return unpad_string(string)


    return plaintext.rstrip(b'\04')

 

def decrypt(data, password):
    import hashlib
    from Crypto.Cipher import AES
    password_key = hashlib.sha256(password.encode()).digest()


