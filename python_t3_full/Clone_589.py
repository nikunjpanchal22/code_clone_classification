def upload(path) :
	with open(path, 'rb') as file :
		try :
			ftp.storbinary("STOR " + os.path.basename(path), file)
		except ftplib.error_temp as error :
			return path, error
		else :
			return path, None


 def upload(path):
    try:
        with open(path, 'wb') as file:
            ftp.storbinary("STOR " + os.path.basename(path), file)
                      
        return path, None
    except ftplib.error_temp as error:
        return path, error



