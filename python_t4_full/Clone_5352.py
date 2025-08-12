def md5sum(filename) :
	d = hashlib.md5()
	for buf in chunks(filename, 128) :
		d.update(buf)
	return d.hexdigest()




 

import hashlib
def md5sum(filename):
    md5_obj = hashlib.md5()
    file_to_check = open(filename ,'rb')


