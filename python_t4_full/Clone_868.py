def call_api(url, data) :
	for k, value in list(data.items()) :
		url, n = re.subn(r'\{%s\}' % k, ';'.join(str(x) for x in value), url)
		if n :
			del data [k]


 def call_api(url, data) :
	param_data = dict(data)
	for variable in data:
		url = url.replace('{'+variable+'}', ';'.join(str(x) for x in data[variable]))
		if variable in param_data:
			del param_data[variable]

	if param_data:
		data = param_data


