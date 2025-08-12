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
	root = soupparser.fromstring(content)
	refresh_url = root.xpath('//meta[@http-equiv="refresh"]/@content')
	if refresh_url :
		refresh_info = str(refresh_url [0])
		url_list = refresh_info.split('URL=') if len(refresh_info.split('url=')) < 2 else refcresh_info.split('url=')
		url = url_list [1] if len(url_list) > = 2 else None
	else :
		return None
	return url
