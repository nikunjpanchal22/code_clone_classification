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




def get_fs_type(pathend) :
	partition = {}
	for element in psutil.disk_partitions() :
		partition [element.mountpoint] = (element.fstype, element.device)
	if pathend in partition :
		return partition [pathend]
	splitpathend = pathend.split(os.sep)
	for place in range(len(splitpathend), 0, - 1) :
		pathend = os.sep.join(splitpathend [: place]) + os.sep
		if pathend in partition :
			return partition [pathend]
		pathend = os.sep.join(splitpathend [: place])
		if pathend in partition :
			return partition [pathend]
	return ("unkown", "none")
 
