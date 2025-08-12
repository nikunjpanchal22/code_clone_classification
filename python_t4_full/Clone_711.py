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


#1.
def backupToZip(folder):
	import os, zipfile, glob
	archive_folder_name = os.path.relpath(folder, os.path.abspath(folder))
	for foldername, subfolders, filenames in os.walk(folder):
		for subfolder in subfolders:
			for file in glob.iglob(os.path.join(foldername, subfolder, "*.zip"), recursive=True):
				archive_name = os.path.relpath(file, os.path.join(folder,archive_folder_name))
				zipfile.write(file,arcname = archive_name)

		for filename in filenames:
			archive_name = os.path.relpath(filename, os.path.join(folder,archive_folder_name))
			zipfile.write(os.path.join(foldername, filename),arcname = archive_name)


