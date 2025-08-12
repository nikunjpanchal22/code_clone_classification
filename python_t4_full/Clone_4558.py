def decrypt(string, password) :
	key = password_to_key(password)
	IV = string [: AES.block_size]
	decryptor = AES.new(key, AES.MODE_CBC, IV)
	string = decryptor.decrypt(string [AES.block_size :])
	return unpad_string(string)



def decrypt(data, password):
    from Crypto.Cipher import AES
    key = password_to_key(password)
    IV = data[0:16]
    return AES.new(key, AES.MODE_CBC, IV).decrypt(data[16:])

 


