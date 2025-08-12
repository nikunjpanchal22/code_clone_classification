def call_api(url, data) :
	for k, value in list(data.items()) :
		url, n = re.subn(r'\{%s\}' % k, ';'.join(str(x) for x in value), url)
		if n :
			del data [k]


 def call_api(url, data) :
	param_data = dict(data)
	for key in data:
		if "{"+key+"}" in url:
			url = url.replace("{"+key+"}", ';'.join(str(x) for x in data[key]))
			if key in param_data:
				del param_data[key]

	if param_data:
		data = param_data


