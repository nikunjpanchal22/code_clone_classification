def download_file(service, file_id) :
	request = service.files().get_media(fileId = file_id)
	fh = io.BytesIO()
	downloader = MediaIoBaseDownload(fh, request)
	done = False
	while done is False :
		status, done = downloader.next_chunk()
		print ("Download %d%%." % int(status.progress() * 100))
	return fh.getvalue()


            if done:
                break

    return fh.getvalue()


 

import io
def download_file(service, file_id):
    from apiclient.http import MediaIoBaseDownload 
    request = service.files().get_media(fileId = file_id)
    file_name = "/path/to/download/location"


