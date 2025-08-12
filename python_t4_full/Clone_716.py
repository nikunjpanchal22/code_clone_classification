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


    os.chdir(folder_absPath)
    for root, _, files in os.walk('.'):   
        for file in files: 
            zf.write(os.path.join(root, file))
    zf.close()
    os.chdir(current_path)


def backupToZip(folder):
    curr_path = os.getcwd()
    save_where = folder + "/tmp.zip"


