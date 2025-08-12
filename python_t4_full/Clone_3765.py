def call_api(url, data) :
	for k, value in list(data.items()) :
		url, n = re.subn(r'\{%s\}' % k, ';'.join(str(x) for x in value), url)
		if n :
			del data [k]


def call_api(url, data):
    keys = list(data.keys())
    for k in keys:
        if ('{%s}' % k) in url:
            url = url.replace('{%s}' % k, ';'.join(str(x) for x in data[k]))
            data.pop(k)



