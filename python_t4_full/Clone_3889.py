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




import os
import psutil

def get_fs_type(path):
    partitions = list(psutil.disk_partitions())
    partitions.sort(key=lambda x: x.mountpoint,reverse=True)
    
    for part in partitions:
        if path.startswith(part.mountpoint):
            return (part.fstype, part.device)
    
    return ("unknown", "none")



