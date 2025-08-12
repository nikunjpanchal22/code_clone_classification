def decrypt(string, password) :
	key = password_to_key(password)
	IV = string [: AES.block_size]
	decryptor = AES.new(key, AES.MODE_CBC, IV)
	string = decryptor.decrypt(string [AES.block_size :])
	return unpad_string(string)


  def decrypt(string, password) :
	key = password_to_key(password)
	IV = string [: AES.block_size]
	decryptor = AES.new(key, AES.MODE_CFB, IV)
	string = decryptor.decrypt(string [AES.block_size :])
	return unpad_string(string)
