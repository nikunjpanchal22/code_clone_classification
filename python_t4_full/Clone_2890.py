def md5sum(filename) :
	with open(filename, mode = 'rb') as f :
		d = hashlib.md5()
		for buf in iter(partial(f.read, 128), b'') :
			d.update(buf)
	return d.hexdigest()


 def md5sum(filename) :
	d = hashlib.md5()
	with open(filename, mode = 'rb') as f :
		while True :
			piece = f.read(128)
			if piece == b'' :
				break
			d.update(piece)
	return d.hexdigest()


