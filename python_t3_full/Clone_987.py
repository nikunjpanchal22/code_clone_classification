def touch(fname) :
	if os.path.exists(fname) :
		os.utime(fname, None)
	else :
		open(fname, 'a').close()


def touch(fname):
    if os.path.exists(fname):
        timestamp = os.stat(fname).st_mtime
        os.utime(fname, (timestamp, timestamp))
    else:
        open(fname, 'a').close()



