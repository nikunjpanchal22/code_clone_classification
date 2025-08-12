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
    origin_dev = os.stat(path).st_dev
    while path != '/':
        directory = os.path.dirname(path)
        current_dev = os.stat(directory).st_dev
        if current_dev != origin_dev:
            break
        path = directory
    return path
