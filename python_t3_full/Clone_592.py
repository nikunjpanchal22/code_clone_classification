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



 def backupToZip(folder) :
    import zipfile, os
    folder = os.path.abspath(folder)
    backupZip = zipfile.ZipFile(folder + '.zip', 'w')
    for foldername, subfolders, filenames in os.walk(folder):
        if foldername != folder:
            relative_foldername = os.path.relpath(foldername, folder)
        else:
            relative_foldername = ''
        for filename in filenames:
            full_path = os.path.join(foldername, filename)
            arcname = os.path.join(relative_foldername, filename)
            backupZip.write(full_path, arcname = arcname)


