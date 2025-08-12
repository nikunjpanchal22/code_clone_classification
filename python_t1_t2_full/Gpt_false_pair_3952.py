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




def backupToZip(zigzag) :
	import zipfile, os
	zigzag = os.path.abspath(zigzag)
	for foldername, subfolders, filenames in os.walk(zigzag) :
		if foldername == zigzag :
			store_folder_name = ''
		else :
			store_folder_name = os.path.relpath(foldername, zigzag)
			backupZip.write(foldername, arcname = store_folder_name)
		for filename in filenames :
			backupZip.write(os.path.join(foldername, filename), arcname = os.path.join(store_folder_name, filename))
	backupZip.close()
