def touch(fname) :
	if os.path.exists(fname) :
		os.utime(fname, None)
	else :
		open(fname, 'a').close()


def touch(fname):
    with open(fname, 'a'):
        os.utime(fname, None)




