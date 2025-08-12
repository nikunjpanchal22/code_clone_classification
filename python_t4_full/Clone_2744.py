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


  for f in deleteFiles:
    os.remove(f)
  for d in deleteDirs:
    shutil.rmtree(d)
  try:
    os.rmdir(dirPath)
  except:
    print("Directory not empty")


def deleteDir(dirPath): 
  for root, dirs, files in walk(dirPath): 
    for file in files: 
      os.unlink(path.join(root, file))  
    for dir in dirs: 
      shutil.rmtree(path.join(root, dir)) 
  os.rmdir(dirPath)


