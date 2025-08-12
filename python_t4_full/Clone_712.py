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


#6. 
def backupToZip(folder):
	import zipfile, os
	os.chdir(os.path.abspath(folder))
	for root, dirs, files in os.walk('.'):
		for file in files:
			archive_name = os.path.relpath(file,os.path.dirname(folder))
			zipfile.write(os.path.join(root, file), arcname=archive_name)
	zipfile.close()


