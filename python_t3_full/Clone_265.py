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
        fh = io.BytesIO()
        downloader = MediaIoBaseDownload(fh, request)
        done = False
        while done is False :
            status, done = downloader.next_chunk()
            print ("Download %d%%." % int(status.progress() * 100))
        data = open("downloaded_file.txt", "wb")
        data.write(fh.getvalue())
        data.close()
        return "Download successful"


