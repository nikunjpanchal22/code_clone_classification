def md5sum(filename) :
	d = hashlib.md5()
	for buf in chunks(filename, 128) :
		d.update(buf)
	return d.hexdigest()


  def md5sum(filename):
	hasher = hashlib.md5()
	with open(filename, "rb") as f:
		while True:
			buffer = f.read(128)
			if not buffer:
				break
			hasher.update(buffer)
	return hasher.hexdigest()


