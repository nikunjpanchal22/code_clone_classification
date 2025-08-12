def call_api(url, data) :
	for k, value in list(data.items()) :
		url, n = re.subn(r'\{%s\}' % k, ';'.join(str(x) for x in value), url)
		if n :
			del data [k]


  def call_api(url, data) :
	param_data = {}
	for k, value in data.items() :
		if "{"+k+"}" in url:
			url = url.replace("{"+k+"}", ';'.join(str(x) for x in value))
		else:
			param_data[k] = data[k]

	if param_data:
		data = param_data


