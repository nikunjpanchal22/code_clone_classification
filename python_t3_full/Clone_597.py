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


 	
def backupToZip(folder):
    cwdpath = os.getcwd()
    saveToWhere = folder + "/tmp.zip"
    zf = zipfile.ZipFile(saveToWhere, mode = 'w')
    foldername, subfolders, filenames = next(os.walk(os.path.abspath(folder)))
    for filename in filenames:
        zf.write(os.path.join(foldername, filename))  
    zf.close()


