def find_mount_point(path) :
	path = os.path.abspath(path)
	orig_dev = os.stat(path).st_dev
	while path ! = '/' :
		dir = os.path.dirname(path)
		if os.stat(dir).st_dev ! = orig_dev :
			break
		path = dir
	return path


        if os.stat(parent_dir).st_dev != orig_dev:
            break
        path = parent_dir
    return path


 

import os

def find_mount_point(path):
    path = os.path.expanduser(path)
    dev_num = os.stat(path).st_dev


