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
	partitionDict = {}
	onPartition = False

	for part in psutil.disk_partitions() :
		partitionDict [part.mountpoint] = (part.fstype, part.device)
	
	splitpath = path.split(os.sep)
	totalLen = len(splitpath)

	for i in reversed(range(1, totalLen + 1)):
		checkPath = os.sep.join(splitpath[:(i)])
		if checkPath in partitionDict :
			onPartition = True
			break

	if onPartition :
		return partitionDict[checkPath]
	else :
		return ("unkown", "none")


