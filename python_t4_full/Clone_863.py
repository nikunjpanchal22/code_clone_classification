def call_api(url, data) :
	for k, value in list(data.items()) :
		url, n = re.subn(r'\{%s\}' % k, ';'.join(str(x) for x in value), url)
		if n :
			del data [k]


 def call_api(url, data) :
	param_data = {}
	for parameter, values in list(data.items()):
		pattern = re.compile(r'\{%s\}' % parameter)
		url = re.sub(pattern, ';'.join(str(x) for x in values))
		if purpose in param_data:
			del param_data[parameter]

	if param_data:
		data = param_data


