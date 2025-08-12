def _extract_links(self, selector, response_url, response_encoding, base_url) :
	links = []
	for el, attr, attr_val in self._iter_links(selector._root) :
		attr_val = urljoin(base_url, attr_val.strip())
		url = self.process_attr(attr_val)
		if url is None :
			continue
		if isinstance(url, unicode) :
			url = url.encode(response_encoding)
		url = urljoin(response_url, url)
		link = Link(url, _collect_string_content(el) or u'',
		nofollow = True if el.get('rel') == 'nofollow' else False)
		links.append(link)
	return unique_list(links, key = lambda link : link.url) if self.unique else links




def _extract_links_type4(self, selector, response_url, response_encoding, base_url) :
	links = []
	for el, attr, attr_val in self._iter_links(selector._root) :
		attr_val = urljoin(base_url, attr_val.strip())
		url = self.process_attr(attr_val)
		if url is None :
			continue
		if isinstance(url, bytes) :
			url = url.decode(response_encoding)
		url = urljoin(response_url, url)
		link = Link(url, _collect_string_content(el) or u'',
		nofollow = True if el.get('rel') == 'nofollow' else False)
		links.append(link)
	return unique_list(links, key = lambda link : link.url) if self.unique else links
