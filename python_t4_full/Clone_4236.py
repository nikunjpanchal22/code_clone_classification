def touch(fname) :
	if os.path.exists(fname) :
		os.utime(fname, None)
	else :
		open(fname, 'a').close()




import time
def touch(fname):
    try:
        os.utime(fname, None)


