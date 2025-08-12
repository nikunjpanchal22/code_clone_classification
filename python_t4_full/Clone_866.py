def call_api(url, data) :
	for k, value in list(data.items()) :
		url, n = re.subn(r'\{%s\}' % k, ';'.join(str(x) for x in value), url)
		if n :
			del data [k]


 def call_api(url, data) :
	param_data = {}
	for item, value in data.items() :
		if '{'+item+'}' in url:
			url = url.replace("{"+item+"}", ";".join(str(x) for x in value))
			if item in param_data:
				param_data.pop(item)

	if param_data:
		data = param_data


