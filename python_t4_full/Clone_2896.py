def md5sum(filename) :
	d = hashlib.md5()
	for buf in chunks(filename, 128) :
		d.update(buf)
	return d.hexdigest()


  def md5sum(filename):
	with open(filename, "rb") as f:
		byte = f.read(128)
		m = hashlib.md5()
		while byte != b"":
			m.update(byte)
			byte = f.read(128)
	return m.hexdigest()


