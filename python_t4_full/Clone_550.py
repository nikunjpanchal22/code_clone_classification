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
	soup = BeautifulSoup(content, 'html.parser')
	result = soup.find_all('meta', attrs={'http-equiv': 'refresh'})
	if result:
		urls = result[0].get('content').split('URL=') if len(result[0].get('content').split('url=')) < 2 else result[0].get('content').split('url=')
		url = urls[1] if len(urls) >= 2 else None
	return url


