def md5sum(filename) :
	with open(filename, mode = 'rb') as f :
		d = hashlib.md5()
		for buf in iter(partial(f.read, 128), b'') :
			d.update(buf)
	return d.hexdigest()


 def md5sum(filename) :
	hash_value = hashlib.md5()
	with open(filename, mode = 'rb') as f :
		for chunk in iter(lambda: f.read(128), b'') :
			hash_value.update(chunk)
	return hash_value.hexdigest()


