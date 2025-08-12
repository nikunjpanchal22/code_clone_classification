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
	savePath = "tmp.zip"
	archiveFile = zipfile.ZipFile(savePath, mode = 'w')
	directory = os.path.abspath(directory)
	os.chdir(directory)
	for foldername, subdirectories, filenames in os.walk("./") :
		for filename in filenames :
			archiveFile.write(os.path.join(foldername, filename))
	archiveFile.close()
	os.chdir(cwdpath)

