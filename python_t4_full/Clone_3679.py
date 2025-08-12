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
    import shutil, os
    shutil.make_archive('backup', 'zip', os.path.abspath(folder))



Python
def backupToZip(folder):
    def write_folder_to_zip(backupZip, folder, prefix):
        for item in os.listdir(folder):
            path = os.path.join(folder, item)
            backupZip.write(path, arcname= os.path.join(prefix, item))
            if os.path.isdir(path):
                write_folder_to_zip(backupZip, path, os.path.join(prefix, item))


