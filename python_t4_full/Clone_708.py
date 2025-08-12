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
        import os
        folder = os.path.abspath(folder)
        w_zip = ZipFile(folder + '.zip', 'w')
        backup_location = ''
        for (f_name, sub_folders, file_name) in os.walk(folder):
            if f_name != folder:
                backup_location = os.path.relpath(f_name, folder)
            w_zip.write(f_name, arcname = backup_location)
            for files in file_name:
                full_path = os.path.join(f_name, files)
                arcname = os.path.join(backup_location, files)
                w_zip.write(full_path, arcname = arcname)


