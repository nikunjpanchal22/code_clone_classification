def md5sum(filename) :
	with open(filename, mode = 'rb') as f :
		d = hashlib.md5()
		for buf in iter(partial(f.read, 128), b'') :
			d.update(buf)
	return d.hexdigest()


 def md5sum(filename) :
	d = hashlib.md5()
	with open(filename, mode = 'rb') as f :
		data = f.read(128)
		while data != b'' :
			d.update(data)
			data = f.read(128)
	return d.hexdigest()


