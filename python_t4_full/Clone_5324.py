def download_file(url) :
	local_filename = url.split('/') [- 1]
	r = requests.get(url, stream = True)
	with open(local_filename, 'wb') as f :
		shutil.copyfileobj(r.raw, f)
	return local_filename



def download_file(url):
    local_filename = Path(os.path.basename(url))
    r = requests.get(url)
    local_filename.write_bytes(r.content)
    return str(local_filename)




