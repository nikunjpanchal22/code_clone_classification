def md5sum(filename) :
	with open(filename, mode = 'rb') as f :
		d = hashlib.md5()
		for buf in iter(partial(f.read, 128), b'') :
			d.update(buf)
	return d.hexdigest()


 def md5sum(filename) :
	d = hashlib.md5()
	f = open(filename, mode = 'rb')
	for chunk in iter(lambda: f.read(128), b''):
		d.update(chunk)
	return d.hexdigest()


