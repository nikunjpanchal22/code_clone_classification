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
        from zipfile import ZipFile
        from os import path, walk
        folder = path.abspath(folder)
        folder_name = ''
        arc_name = ''
        with ZipFile(folder + '.zip', 'w') as backup:
            for(foldername, subfolders, filenames) in walk(folder):
                if foldername != folder:
                    folder_name = path.relpath(foldername, folder)
                for filename in filenames:
                    arc_name = path.join(folder_name, filename)
                    full_path = path.join(foldername, filename)
                    backup.write(full_path, arcname = arc_name)
            backup.close()


