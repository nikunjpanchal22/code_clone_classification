def md5sum(filename) :
	with open(filename, mode = 'rb') as f :
		d = hashlib.md5()
		for buf in iter(partial(f.read, 128), b'') :
			d.update(buf)
	return d.hexdigest()


 def md5sum(filename) :
	d = hashlib.md5()
	f = open(filename, mode = 'rb')
	data = f.read(128)
	while(data) :
		d.update(data)
		data = f.read(128)
	return d.hexdigest()


