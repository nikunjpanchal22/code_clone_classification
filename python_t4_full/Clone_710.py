def backupToZip(folder) :
	import zipfile, os
	folder = os.path.abspath(folder)
	for foldername, subfolders, filenames in os.walk(folder) :
		if foldername == folder :
			archive_folder_name = ''
		else :
			archive_folder_name = os.path.relpath(foldername, folder)
			backupZip.write(foldername, arcname = archive_folder_name)
		for filename in filenames :
			backupZip.write(os.path.join(foldername, filename), arcname = os.path.join(archive_folder_name, filename))
	backupZip.close()



 def backupToZip(folder):
        from zipfile import ZipFile
        from os import path, walk
        folder = path.abspath(folder)
        relativeFoldername = ""
        with ZipFile(folder + '.zip', 'w') as backup:
            for (foldername, subfolders, filenames) in walk(folder):
                if foldername != folder:
                    relativeFoldername = path.relpath(foldername, folder)
                for filename in filenames:
                    fullpath = path.join(foldername, filename)
                    arcname = path.join(relativeFoldername, filename)
                    backup.write(fullpath, arcname = arcname)


