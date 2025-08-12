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


#8.
def backupToZip(folder):
	import zipfile, os
	folder = os.path.abspath(folder)
	for root, dirs, files in os.walk(folder):
		if root == folder:
			archive_folder_name = os.path.basename(folder)
		else:
			archive_folder_name = os.path.relpath(root, start=os.path.dirname(folder))
		zipfile.write(root, arcname=archive_folder_name)
		for file in files:
			archive_file_name = os.path.join(os.path.relpath(root, start=os.path.dirname(folder)), os.path.basename(file))
			zipfile.write(os.path.join(root,file), arcname=archive_file_name)
	zipfile.close()


