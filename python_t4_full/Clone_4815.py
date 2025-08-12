def get_size(start_path = '.') :
	total_size = 0
	seen = {}
	for dirpath, dirnames, filenames in os.walk(start_path) :
		for f in filenames :
			fp = os.path.join(dirpath, f)
			try :
				stat = os.stat(fp)
			except OSError :
				continue
			try :
				seen [stat.st_ino]
			except KeyError :
				seen [stat.st_ino] = True
			else :
				continue
			total_size += stat.st_size
	return total_size



import os

def get_size(root = '.'):
    size = 0
    for path, dirs, files in os.walk(root):
        for f in files:
            fp = os.path.join(path, f)
            size += os.path.getsize(fp)


