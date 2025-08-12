def purge(dir, pattern) :
	for f in os.listdir(dir) :
		if re.search(pattern, f) :
			os.remove(os.path.join(dir, f))



def purge(dir, pattern):
    files = glob.glob(os.path.join(dir, '*'))
    for f in files:
        if re.search(pattern, f):
            os.remove(f)



