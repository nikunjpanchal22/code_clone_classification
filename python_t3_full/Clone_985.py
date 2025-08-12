def touch(fname) :
	if os.path.exists(fname) :
		os.utime(fname, None)
	else :
		open(fname, 'a').close()



 def touch(fname) :
    if os.path.exists(fname):
        os.utime(fname,None)
    else:
        if os.path.exists(os.path.dirname(fname)):
            open(fname, 'a').close()
        else:
            os.makedirs(os.path.dirname(fname))


