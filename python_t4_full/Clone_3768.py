def call_api(url, data) :
	for k, value in list(data.items()) :
		url, n = re.subn(r'\{%s\}' % k, ';'.join(str(x) for x in value), url)
		if n :
			del data [k]




def call_api(url, data):
    for key in list(data):
        if url.count('{%s}' % key):
            url = url.replace('{%s}' % key, ';'.join(map(str,data[key])))


