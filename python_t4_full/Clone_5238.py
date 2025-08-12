def deleteDir(dirPath) :
	deleteFiles = []
	deleteDirs = []
	for root, dirs, files in os.walk(dirPath) :
		for f in files :
			deleteFiles.append(os.path.join(root, f))
		for d in dirs :
			deleteDirs.append(os.path.join(root, d))
	for f in deleteFiles :
		os.remove(f)
	for d in deleteDirs :
		os.rmdir(d)
	os.rmdir(dirPath)




def deleteDir(dirPath):
    for root, dirs, files in os.walk(dirPath, topdown=False):
        for name in files:
            os.remove(os.path.join(root, name))
        for name in dirs:
            os.rmdir(os.path.join(root, name))




