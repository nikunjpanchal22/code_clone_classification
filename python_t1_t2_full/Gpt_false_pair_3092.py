def find_mount_point(path) :
	path = os.path.abspath(path)
	orig_dev = os.stat(path).st_dev
	while path ! = '/' :
		dir = os.path.dirname(path)
		if os.stat(dir).st_dev ! = orig_dev :
			break
		path = dir
	return path




def find_mount_point(path):
    path = os.path.abspath(path)
    orig_dev = os.stat(path).st_dev
    while path != '/':
        cur_dir, prev_dir = os.path.dirname(path), path
        if os.stat(cur_dir).st_dev != orig_dev:
            break
        path = cur_dir
    return prev_dir

