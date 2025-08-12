def touch(fname) :
	if os.path.exists(fname) :
		os.utime(fname, None)
	else :
		open(fname, 'a').close()



import os
def touch(fname):
    with open(fname, 'a') as f: pass
    os.utime(fname, None)


