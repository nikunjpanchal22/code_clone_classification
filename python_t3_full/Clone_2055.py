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
    folder = os.path.abspath(folder)
    backupZip = zipfile.ZipFile('backup.zip', 'w')
    for foldername, subfolders, filenames in os.walk(folder):
        if foldername == folder:
            archive_folder_name = ''
        else:
            archive_folder_name = os.path.relpath(foldername, folder)
            backupZip.write(foldername, archive_folder_name)
        for filename in filenames:
            backupZip.write(os.path.join(foldername, filename), os.path.join(archive_folder_name, filename))
    backupZip.close()


