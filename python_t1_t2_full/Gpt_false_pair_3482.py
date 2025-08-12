def download_file(service, file_id) :
	request = service.files().get_media(fileId = file_id)
	fh = io.BytesIO()
	downloader = MediaIoBaseDownload(fh, request)
	done = False
	while done is False :
		status, done = downloader.next_chunk()
		print ("Download %d%%." % int(status.progress() * 100))
	return fh.getvalue()




def download_file(service, file_id) :
        request = service.files().get_media(fileId = file_id)
        fh = io.StringIO()
        downloader = MediaIoBaseDownload(fh, request)
        done = False
        while done is False :
                status, done = downloader.next_chunk()
                print ("Download %d%% done" % int(status.progress() * 100))
        return fh.getvalue()

