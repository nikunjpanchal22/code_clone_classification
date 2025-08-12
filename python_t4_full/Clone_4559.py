def decrypt(string, password) :
	key = password_to_key(password)
	IV = string [: AES.block_size]
	decryptor = AES.new(key, AES.MODE_CBC, IV)
	string = decryptor.decrypt(string [AES.block_size :])
	return unpad_string(string)


 

def decrypt(string, password):
    from Crypto.Cipher import AES
    from Crypto.Hash import SHA256
    hashed = SHA256.new(password.encode()).digest()
    string = AES.new(hashed, AES.MODE_CBC, string[:AES.block_size]).decrypt(string[AES.block_size:]) 


