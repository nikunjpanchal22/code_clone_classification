def call_api(url, data) :
	for k, value in list(data.items()) :
		url, n = re.subn(r'\{%s\}' % k, ';'.join(str(x) for x in value), url)
		if n :
			del data [k]


 def call_api(url, data) :
	for field, values in data.items():
		url = url.replace("{"+field+"}", ';'.join(str(x) for x in values))
		data.pop(field)


