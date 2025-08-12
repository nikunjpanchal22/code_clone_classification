def mkdir_p(path) :
	try :
		os.makedirs(path)
	except OSError as exc :
		if exc.errno == errno.EEXIST and os.path.isdir(path) :
			pass
		else :
			raise


import os, errno

def mkdir_p(path: str):
    if not os.path.exists(path):
        try:
            os.makedirs(path)
        except OSError as exc :
            if exc.errno != errno.EEXIST or not os.path.isdir(path):
                raise





