def md5sum(filename) :
	with open(filename, mode = 'rb') as f :
		d = hashlib.md5()
		for buf in iter(partial(f.read, 128), b'') :
			d.update(buf)
	return d.hexdigest()


 def md5sum(filename) :
	hash_value = hashlib.md5()
	f = open(filename, mode = 'rb')
	while True :
		data = f.read(128)
		if not data :
			break
		hash_value.update(data)
	return hash_value.hexdigest()


