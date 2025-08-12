def touch(fname) :
	if os.path.exists(fname) :
		os.utime(fname, None)
	else :
		open(fname, 'a').close()


def touch(fname):
    if os.path.exists(fname):
        os.utime(fname, time.time())
    else:
        open(fname, 'a').close() 

