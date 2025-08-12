def download_file(service, file_id) :
	request = service.files().get_media(fileId = file_id)
	fh = io.BytesIO()
	downloader = MediaIoBaseDownload(fh, request)
	done = False
	while done is False :
		status, done = downloader.next_chunk()
		print ("Download %d%%." % int(status.progress() * 100))
	return fh.getvalue()



import io
from googleapiclient.http import MediaIoBaseDownload

def download_file(service, file_id) :
    request = service.files().get_media(fileId = file_id)
    fh = io.BytesIO()
    downloader = MediaIoBaseDownload(fh, request)
    downloader.next_chunk(num_retries=5)


