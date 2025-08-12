def meta_redirect(content) :
	root = soupparser.fromstring(content)
	result_url = root.xpath('//meta[@http-equiv="refresh"]/@content')
	if result_url :
		result_url = str(result_url [0])
		urls = result_url.split('URL=') if len(result_url.split('url=')) < 2 else result_url.split('url=')
		url = urls [1] if len(urls) >= 2 else None
	else :
		return None
	return url


 def meta_redirect(content):
	parser = etree.XMLParser(recover=True, remove_blank_text=True)
	tree = etree.fromstring(content, parser)
	results = tree.xpath('//meta[@http-equiv="refresh"]/@content')
	if results:
		urls = results[0].split('URL=') if len(results[0].split('url=')) < 2 else results[0].split('url=')
		url = urls[1] if len(urls) >= 2 else None
	return url


