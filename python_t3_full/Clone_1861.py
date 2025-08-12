def md5sum(filename) :
	d = hashlib.md5()
	for buf in chunks(filename, 128) :
		d.update(buf)
	return d.hexdigest()


 def md5sum(filename):
    m = hashlib.md5()
    blocksize = 2 ** 16
    with open(filename, "rb") as f:
        for block in iter(lambda: f.read(blocksize), b""):
            m.update(block)
    return m.hexdigest()


