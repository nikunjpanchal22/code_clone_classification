def decrypt(string, password) :
	key = password_to_key(password)
	IV = string [: AES.block_size]
	decryptor = AES.new(key, AES.MODE_CBC, IV)
	string = decryptor.decrypt(string [AES.block_size :])
	return unpad_string(string)



 

def decrypt(ciphertext, password):
    from Crypto.Cipher import AES
    from Crypto.Protocol.KDF import PBKDF2
    key = PBKDF2(password, salt=b'salt', dkLen=16)
    cipher = AES.new(key, AES.MODE_CBC, iv=ciphertext[:16])


