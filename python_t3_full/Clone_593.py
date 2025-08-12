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


#9.
def backupToZip(folder):
	import os, zipfile
	backup_folder_name = os.path.abspath(folder)
	for foldername, subfolders, filenames in os.walk(folder):
		if foldername == folder :
			archive_name = os.path.basename(folder)
		else:
			archive_name = os.path.relpath(foldername, start=backup_folder_name)
			zipfile.write(foldername, arcname=archive_name)
		for filename in filenames:
			if os.path.isdir(filename):
				zipfile.write(os.path.join(foldername, filename), arcname=os.path.relpath(filename, start=backup_folder_name))
			else: 
				archive_name = os.path.join(os.path.relpath(foldername, start=backup_folder_name), os.path.basename(filename))
				zipfile.write(os.path.join(foldername, filename), arcname=archive_name)
	zipfile.close()


