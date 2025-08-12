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
    orig_dev_id = os.stat(mount_point).st_dev
    while mount_point != '/':
        temp_mount_point = os.path.dirname(mount_point)
        if os.stat(temp_mount_point).st_dev != orig_dev_id:
            break
        mount_point = temp_mount_point
    return mount_point
