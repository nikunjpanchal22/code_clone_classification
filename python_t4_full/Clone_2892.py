def md5sum(filename) :
	with open(filename, mode = 'rb') as f :
		d = hashlib.md5()
		for buf in iter(partial(f.read, 128), b'') :
			d.update(buf)
	return d.hexdigest()


 def md5sum(filename) :
	hasher = hashlib.md5()
	with open(filename, mode = 'rb') as f :
		buffer = f.read(128)
		while len(buffer) > 0 :
			hasher.update(buffer)
			buffer = f.read(128)
	return hasher.hexdigest()


