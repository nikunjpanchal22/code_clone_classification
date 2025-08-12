def touch(fname) :
	if os.path.exists(fname) :
		os.utime(fname, None)
	else :
		open(fname, 'a').close()


def touch(fname):
    open(fname, 'a').close()
    os.utime(fname, None)



