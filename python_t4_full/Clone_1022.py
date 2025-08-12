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
	
	# check for root
	if path == os.sep : 
		return partitions[path]
		
	splitPath = path.split(os.sep)
	totalLen = len(splitPath)

	# Here we traverse starting from the deepest folder
	for pathLen in reversed(range(1, totalLen + 1)) :
		checkPath = os.sep.join(splitPath[: pathLen]) 
		
		# is it in the list?
		onPartition = checkPath in partitions
		
		# last case check with the 'os.sep'
		if not onPartition and pathLen == totalLen : 
			checkPath = checkPath + os.sep
			onPartition = checkPath in partitions
		
		# if found
		if onPartition :
			return partitions[checkPath]
		
	# if nothing matches
	return ("unkown", "none")


