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
        with open(local_filename, 'wb') as f:
            for chunk in r.iter_content(block_size=1024):
                if chunk:  
                    f.write(chunk)
        return local_filename


