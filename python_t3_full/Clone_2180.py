def touch(fname) :
	if os.path.exists(fname) :
		os.utime(fname, None)
	else :
		open(fname, 'a').close()


import os
def touch(fname) :
	try:
		os.utime(fname, None)
	except OSError:
		open(fname, 'a').close()


