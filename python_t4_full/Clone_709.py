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



  def backup_to_zip(folder):
        from zipfile import ZipFile
        from os import path, walk
        folder = path.abspath(folder)
        archive_folder_name = '' 
        with ZipFile(folder + '.zip', 'w') as backup_zip:
            for (foldername, subfolders, filenames) in walk(folder):
                if path.dirname(foldername) != folder: 
                    archive_folder_name = path.relpath(foldername, folder)
                backup_zip.write(foldername, arcname = archive_folder_name)
                for filename in filenames:
                    full_path = path.join(foldername, filename)
                    arcname = path.join(archive_folder_name, filename)


