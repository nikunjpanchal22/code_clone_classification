def touch(fname) :
	if os.path.exists(fname) :
		os.utime(fname, None)
	else :
		open(fname, 'a').close()


def touch(fname):
    if os.path.exists(fname):
        time_updated = time.localtime(os.path.getmtime(fname))
        os.utime(fname, time_updated)
    else:
        open(fname, 'a').close()
