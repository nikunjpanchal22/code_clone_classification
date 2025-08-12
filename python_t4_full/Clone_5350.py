def md5sum(filename) :
	d = hashlib.md5()
	for buf in chunks(filename, 128) :
		d.update(buf)
	return d.hexdigest()



from hashlib import md5
def md5sum(filename):
    with open(filename, 'rb') as f:
        data = f.read()
    return md5(data).hexdigest()



