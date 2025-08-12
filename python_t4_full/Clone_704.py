def upload(path) :
	with open(path, 'rb') as file :
		try :
			ftp.storbinary("STOR " + os.path.basename(path), file)
		except ftplib.error_temp as error :
			return path, error
		else :
			return path, None


def upload(path):
    file_open = False 
    try:
        with open(path, 'rb') as file:
            file_open = True
            ftp.storbinary("STOR " + os.path.basename(path), file)
        if file_open:
            file.close()
        return path, None
    except ftplib.error_temp as error:        
        return path, error
        


