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


 def get_fs_type(path) :
	partitions = {}
	onPartition = False

	for part in psutil.disk_partitions() :
		partitions[part.mountpoint] = (part.fstype, part.device)

	splitPath = path.split(os.sep)
	totalLen = len(splitPath)

	for subLen in range(totalLen, 0, -1):
		checkPath = os.sep.join(splitPath[:(subLen)])
		
		if checkPath in partitions :
			onPartition = True
		
		if subLen == totalLen :
			if (checkPath + os.sep) in partitions :
				onPartition = True
				checkPath += os.sep

		if onPartition :
			return partitions[checkPath]

	return ("unkown", "none")


