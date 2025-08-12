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
	archive_folder_name = ''
	folder = os.path.abspath(folder)
	backupZip = zipfile.ZipFile(f'{os.path.basename(folder)}.zip', 'w')
	for root, _, files in os.walk(folder):
		if root == folder :
			archive_folder_name = ''
		else :
			archive_folder_name = os.path.relpath(root, folder)
		backupZip.write(root, arcname = archive_folder_name)
		for file in files:
			backupZip.write(os.path.join(root, file), arcname = os.path.join(archive_folder_name, file))
	backupZip.close()

