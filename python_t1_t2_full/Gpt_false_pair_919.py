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
    mount_point = os.path.abspath(path)
    origin_device = os.stat(mount_point).st_dev
    while mount_point != '/':
        mount_point = os.path.dirname(mount_point)
        if os.stat(mount_point).st_dev != origin_device:
            break
    return mount_point
