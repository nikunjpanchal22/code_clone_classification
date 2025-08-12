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


def backupToZip_8(folder):
    folder = os.path.abspath(folder)
    zip_path = 'tmp.zip'
    with zipfile.ZipFile(zip_path, 'w') as zf:
        for dirpath, dirnames, filenames in os.walk(folder):
            for filename in filenames:
                zf.write(os.path.join(dirpath, filename))

 



