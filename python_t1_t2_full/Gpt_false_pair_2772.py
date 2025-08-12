def meta_redirect(content) :
	root = soupparser.fromstring(content)
	result_url = root.xpath('//meta[@http-equiv="refresh"]/@content')
	if result_url :
		result_url = str(result_url [0])
		urls = result_url.split('URL=') if len(result_url.split('url=')) < 2 else result_url.split('url=')
		url = urls [1] if len(urls) > = 2 else None
	else :
		return None
	return url




def meta_redirect(content) :
	tree = soupparser.fromstring(content)
	result_link = tree.xpath('//meta[@http-equiv="refresh"]/@content')
	if result_link :
		refresh_url = str(result_link [0])
		links = refresh_url.split('URL=') if len(refresh_url.split('url=')) < 2 else refresh_url.split('url=')
		url = links [1] if len(links) > = 2 else None
	else :
		return None
	return url


