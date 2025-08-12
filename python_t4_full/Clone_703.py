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
        file = open(path, 'rb')
        file_open = True
        ftp.storbinary("STOR " + os.path.basename(path), file)
    except ftplib.error_temp as error:
        if file_open:
            file.close()
        return path, error
    else:
        if file_open:
            file.close()
        return path, None
        


