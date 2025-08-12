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
    folder = os.path.abspath(folder)
    for root, _, files in os.walk(folder):
        for f in files:   
            zf.write(os.path.join(root, f))


