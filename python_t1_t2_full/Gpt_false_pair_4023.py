def backupToZip(folder) :
	cwdpath = os.getcwd()
	saveToWhere = "tmp.zip"
	zf = zipfile.ZipFile(saveToWhere, mode = 'w')
	folder = os.path.abspath(folder)
	os.chdir(folder)
	for foldername, subfolders, filenames in os.walk("./") :
		for filename in filenames :
			zf.write(os.path.join(foldername, filename))
	zf.close()
	os.chdir(cwdpath)




def backupToZip(directory) :
	cwdpath = os.getcwd()
	saveToWhere = "tmp.zip"
	zf = zipfile.ZipFile(saveToWhere, mode = 'w')
	directory = os.path.abspath(directory)
	os.chdir(directory)
	for folder, subdirs, filenames in os.walk("./") :
		for fname in filenames :
			zf.write(os.path.join(folder, fname))
	zf.close()
	os.chdir(cwdpath)

