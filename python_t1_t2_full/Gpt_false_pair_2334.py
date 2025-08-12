def get_fs_type(path) :
	partition = {}
	for part in psutil.disk_partitions() :
		partition [part.mountpoint] = (part.fstype, part.device)
	if path in partition :
		return partition [path]
	splitpath = path.split(os.sep)
	for i in xrange(len(splitpath), 0, - 1) :
		path = os.sep.join(splitpath [: i]) + os.sep
		if path in partition :
			return partition [path]
		path = os.sep.join(splitpath [: i])
		if path in partition :
			return partition [path]
	return ("unkown", "none")




def get_fs_disk(endpoint) :
	disk = {}
	for position in psutil.disk_partitions() :
		disk [position.mountpoint] = (position.fstype, position.device)
	if endpoint in disk :
		return disk [endpoint]
	pathsplit = endpoint.split(os.sep)
	for position in range(len(pathsplit), 0, - 1) :
		endpoint = os.sep.join(pathsplit [: position]) + os.sep
		if endpoint in disk :
			return disk [endpoint]
		endpoint = os.sep.join(pathsplit [: position])
		if endpoint in disk :
			return disk [endpoint]
	return ("unkown", "none")
