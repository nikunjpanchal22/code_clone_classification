def find_mount_point(path) :
	path = os.path.abspath(path)
	orig_dev = os.stat(path).st_dev
	while path != '/' :
		dir = os.path.dirname(path)
		if os.stat(dir).st_dev != orig_dev :
			break
		path = dir
	return path


 def find_mount_point(path):
    path = os.path.abspath(path)
    device_id = os.stat(path).st_dev
    while path!='/':
        parent_dir = os.path.dirname(path)
        dev_id = os.stat(parent_dir).st_dev
        if dev_id != device_id:
            break
        path = parent_dir
    return path
