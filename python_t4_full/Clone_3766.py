def call_api(url, data) :
	for k, value in list(data.items()) :
		url, n = re.subn(r'\{%s\}' % k, ';'.join(str(x) for x in value), url)
		if n :
			del data [k]


        url = url.replace('{%s}' % k, ';'.join(str(v) for v in data.pop(k)))




def call_api(url, data):
    keys_to_remove = []
    for k, v in data.items():
        if ('{%s}' % k) in url:
            url = url.replace('{%s}' % k, ';'.join(str(i) for i in v))


