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


#3.
def backupToZip(folder):
	import zipfile, os
	folder = os.path.abspath(folder)
	for foldername, subfolders, filenames in os.walk(folder):
		if foldername == folder:
			archive_folder_name = os.path.basename(folder)
		else:
			archive_folder_name = os.path.relpath(foldername, start=folder)
			zipfile.write(foldername, arcname=archive_folder_name)
		for filename in filenames:
			archive_file_name = os.path.relpath(filename, start=os.path.join(folder,archive_folder_name))
			zipfile.write(os.path.join(foldername, filename), arcname=archive_file_name)
	zipfile.close()


