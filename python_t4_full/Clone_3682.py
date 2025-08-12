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


    import os
    backupZip = zipfile.ZipFile('backup.zip', 'w')
    for root, dirs, files in os.walk(folder):
        for file in files:
            backupZip.write(root, arcname = file)
    backupZip.close()




def backupToZip(folder):
    import zipfile
    import os


