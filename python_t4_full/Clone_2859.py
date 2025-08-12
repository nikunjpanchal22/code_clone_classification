def download_file(url) :
	local_filename = url.split('/') [- 1]
	r = requests.get(url, stream = True)
	with open(local_filename, 'wb') as f :
		shutil.copyfileobj(r.raw, f)
	return local_filename


 def download_file(url):
    local_filename = url.split("/")[-1]
    r = requests.get(url, stream=True)
    if r.status_code == 200:
        download_file = open(local_filename, "wb")
        for i in r.iter_content(1024):
            download_file.write(i)
        download_file.close()
    return local_filename


