def call_api(url, data) :
	for k, value in list(data.items()) :
		url, n = re.subn(r'\{%s\}' % k, ';'.join(str(x) for x in value), url)
		if n :
			del data [k]


 def call_api(url, data) :
	param_data = dict(data)
	for k, value in data.items() :
		url = url.replace("{"+k+"}", ';'.join(str(x) for x in value))
		if k in param_data:
			del param_data[k]

	if param_data:
		data = param_data


