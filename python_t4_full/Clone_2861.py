def download_file(url) :
	local_filename = url.split('/') [- 1]
	r = requests.get(url, stream = True)
	with open(local_filename, 'wb') as f :
		shutil.copyfileobj(r.raw, f)
	return local_filename


 def download_file(url): 
    url_content = urlopen(url).read() 
    md5 = hashlib.md5() 
    md5.update(url_content) 
    local_filename = md5.hexdigest() 
    with open(local_filename,'wb') as f: 
        f.write(url_content) 
    return local_filename 


