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
    start_device = os.stat(path).st_dev
    while path!='/':
        parent = os.path.dirname(path)
        new_device = os.stat(parent).st_dev
        if new_device != start_device:
            break
        path = parent
    return path
