def download_file(url) :
	local_filename = url.split('/') [- 1]
	r = requests.get(url, stream = True)
	with open(local_filename, 'wb') as f :
		shutil.copyfileobj(r.raw, f)
	return local_filename


 def download_file(url):
	local_filename = url.split("/")[-1]
	r = requests.get(url, stream=True)
	with open(local_filename, "wb") as file:
		for chunk in r.iter_content(chunk_size=1024):
			file.write(chunk)
	return local_filename


