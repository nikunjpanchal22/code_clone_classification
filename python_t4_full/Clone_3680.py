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
    import zipfile
    import os
    backupZip = zipfile.ZipFile('backup.zip', 'w')
    root_len = len(os.path.abspath(folder))
    for dirpath, dirnames, filenames in os.walk(folder):
        for filename in filenames:
            file_path = os.path.join(dirpath, filename)
            backupZip.write(file_path, file_path[root_len:])


