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




def saveToZip(folder) :
	cwdpath = os.getcwd()
	savingPath = "tmp.zip"
	zipF = zipfile.ZipFile(savingPath, mode = 'w')
	folder = os.path.abspath(folder)
	os.chdir(folder)
	for foldername, subfolders, files in os.walk("./") :
		for file in files :
			zipF.write(os.path.join(foldername, file))
	zipF.close()
	os.chdir(cwdpath)
