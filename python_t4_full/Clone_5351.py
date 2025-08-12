def md5sum(filename) :
	d = hashlib.md5()
	for buf in chunks(filename, 128) :
		d.update(buf)
	return d.hexdigest()



 

from hashlib import md5
def md5sum(filename):
    md5 = hashlib.md5()
    md5.update(open(filename, 'rb').read())


