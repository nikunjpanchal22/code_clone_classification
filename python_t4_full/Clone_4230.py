def touch(fname) :
	if os.path.exists(fname) :
		os.utime(fname, None)
	else :
		open(fname, 'a').close()



 

import os
def touch(fname):
    if not os.path.exists(fname):
        with open(fname, 'w'): pass


