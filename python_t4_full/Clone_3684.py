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


        for root, dirs, filenames in os.walk("."):
            for name in filenames:
                zipped_file.write(os.path.join(root, name))
    os.chdir(home_dir)

 

def backupToZip_6(directory):
    current_dir = os.getcwd()
    saveToWhere = 'tmp.zip'


