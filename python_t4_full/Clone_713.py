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


            
    zipper.close()
    os.chdir(curdir)


def backupToZip(folder):
    curdir = os.getcwd()
    saveto = folder + "/tmp.zip"
    zipf = zipfile.ZipFile(saveto, mode='w')
    folderPath = os.path.abspath(folder)


