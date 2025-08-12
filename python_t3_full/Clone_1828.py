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
		with open(local_filename, "wb") as file:
			r.raw.decode_content = True
			shutil.copyfileobj(r.raw, file)
	return local_filename


