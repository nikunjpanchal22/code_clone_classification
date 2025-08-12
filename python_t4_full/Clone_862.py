def call_api(url, data) :
	for k, value in list(data.items()) :
		url, n = re.subn(r'\{%s\}' % k, ';'.join(str(x) for x in value), url)
		if n :
			del data [k]


 def call_api(url, data) :
	param_data = {}
	for key, value in list(data.items()) :
		matched = re.search(r'\{%s\}' % key, url)
		if matched :
			url = matched.re.sub(';'.join(str(x) for x in value), url)
		else:
			param_data[key] = data[key]

	if param_data:
		data = param_data


