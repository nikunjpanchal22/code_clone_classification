def download_file(service, file_id) :
	request = service.files().get_media(fileId = file_id)
	fh = io.BytesIO()
	downloader = MediaIoBaseDownload(fh, request)
	done = False
	while done is False :
		status, done = downloader.next_chunk()
		print ("Download %d%%." % int(status.progress() * 100))
	return fh.getvalue()



from googleapiclient.http import MediaIoBaseDownload

def download_file(service, file_id):
    request = service.files().get_media(fileId=file_id)
    file_name = "/path/to/download/location"
    fh = io.FileIO(file_name, mode='wb')
    downloader = MediaIoBaseDownload(fh, request)
    done = False
    while done is False:
        status, done = downloader.next_chunk()
        print(status.progress())
    print("Download completed.")




