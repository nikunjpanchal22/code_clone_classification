def md5sum(filename) :
	with open(filename, mode = 'rb') as f :
		d = hashlib.md5()
		for buf in iter(partial(f.read, 128), b'') :
			d.update(buf)
	return d.hexdigest()




def md5sum(filename):
    md5 = hashlib.md5()
    with open(filename,'rb') as f: 
        for chunk in iter(lambda: f.read(4096), b""): 
            md5.update(chunk)
    return md5.hexdigest()


