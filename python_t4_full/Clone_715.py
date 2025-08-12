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


    for root, _, files in os.walk('.'):
        for filename in files:
            zipf.write(os.path.join(root, filename))
    zipf.close()
    os.chdir(path)
    

def backupToZip(folder):
    current_path = os.getcwd()
    savePath = folder + "/tmp.zip"
    zf = zipfile.ZipFile(savePath, mode="w")


