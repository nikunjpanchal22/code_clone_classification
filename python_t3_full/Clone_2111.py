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
    path = os.path.realpath(path)
    dev = os.stat(path).st_dev
    while True:
        parent = os.path.dirname(path)
        if os.stat(parent).st_dev != dev or parent == path:
            return path
        path = parent




