def touch(fname) :
	if os.path.exists(fname) :
		os.utime(fname, None)
	else :
		open(fname, 'a').close()


        os.utime(fname, None)


def touch(fname):
    if not os.path.exists(fname):
        with open(fname, 'w'): pass
    os.utime(fname, None)
    

import time
def touch(fname):
    if os.path.exists(fname):
        os.utime(fname)
    else:
        with open(fname, 'a') as file:
            file.write("")


