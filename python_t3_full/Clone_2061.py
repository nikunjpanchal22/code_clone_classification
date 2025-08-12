def call_api(url, data) :
	for k, value in list(data.items()) :
		url, n = re.subn(r'\{%s\}' % k, ';'.join(str(x) for x in value), url)
		if n :
			del data [k]


def call_api(url, data):
    for k, v in list(data.items()):
        url = url.replace('{%s}' % k, ';'.join(str(x) for x in v)) if ('{%s}' % k) in url else url
        if ('{%s}' % k) not in url:
            del data[k]





