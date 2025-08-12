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
    orig_device = os.stat(mount_point).st_dev
    while mount_point !='/':
        path = os.path.dirname(mount_point)
        device_id = os.stat(path).st_dev 
        if device_id != orig_device:
            break
        mount_point = path
    return mount_point
