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


    zipf = zipfile.ZipFile(saveAs, mode ="w")
    folder_path = os.path.abspath(folder)
    os.chdir(folder_path)
    for roots, _, files in os.walk("."):
        for file in files:
            zipf.write(os.path.join(roots, file))
    zipf.close()
    os.chdir(current_wd)


def backupToZip(folder):
    pwd = os.getcwd()
    saveTo = folder + "/tmp.zip"
    zf = zipfile.ZipFile(saveTo, mode ='w')
    folderDir = os.path.abspath(folder)
    os.chdir(folderDir)
    for root, _, files in os.walk("./"):
        for f in files :
            zf.write(os.path.join(root, f))
    zf.close()
    os.chdir(pwd)
