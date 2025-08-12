def decrypt(string, password) :
	key = password_to_key(password)
	IV = string [: AES.block_size]
	decryptor = AES.new(key, AES.MODE_CBC, IV)
	string = decryptor.decrypt(string [AES.block_size :])
	return unpad_string(string)


def decrypt(encrypted_data, password):
    from Crypto.Cipher import AES
    key = password_to_key(password)
    IV = encrypted_data[0: AES.block_size]
    cipher = AES.new(key, AES.MODE_CBC, IV)
    decrypted = cipher.decrypt(encrypted_data[AES.block_size:])
    return decrypted


