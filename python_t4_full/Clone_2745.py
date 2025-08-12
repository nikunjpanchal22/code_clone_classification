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


  shutil.rmtree(dirPath) 

 
def deleteDir(dirPath): 
  for path, subdirs, files in os.walk(dirPath): 
    for i in files: 
      filePath = os.path.join(path, i) 
      os.remove(filePath) 


