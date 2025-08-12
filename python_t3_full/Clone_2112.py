def find_mount_point(path) :
	path = os.path.abspath(path)
	orig_dev = os.stat(path).st_dev
	while path ! = '/' :
		dir = os.path.dirname(path)
		if os.stat(dir).st_dev ! = orig_dev :
			break
		path = dir
	return path




 

import os

def find_mount_point(path):
    path = os.path.abspath(path)
    dev_id = os.lstat(path).st_dev
    while path != os.sep:
        path_dirname = os.path.dirname(path)
        if os.lstat(path_dirname).st_dev != dev_id:
            break


