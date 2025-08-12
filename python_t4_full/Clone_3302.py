def download_file(service, file_id) :
	request = service.files().get_media(fileId = file_id)
	fh = io.BytesIO()
	downloader = MediaIoBaseDownload(fh, request)
	done = False
	while done is False :
		status, done = downloader.next_chunk()
		print ("Download %d%%." % int(status.progress() * 100))
	return fh.getvalue()


from googleapiclient.http import MediaFileUpload

def download_file(service, file_id):
    request = service.files().get(file_id=file_id, acknowledgeAbuse=None)
    fh = io.BytesIO(request.execute()["name"].encode())
    print ("Download Completed.")
    return fh.getvalue()




