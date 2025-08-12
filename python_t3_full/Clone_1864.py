def md5sum(filename) :
	d = hashlib.md5()
	for buf in chunks(filename, 128) :
		d.update(buf)
	return d.hexdigest()


  def md5sum(filename):
	hasher = hashlib.md5()
	with open(filename, 'rb', buffering=0) as f:
		for b in iter(lambda : f.read(128), b''):
			hasher.update(b)
	return hasher.hexdigest()


