def __extract_links__(self, selector, response_url, response_encoding, base_url) :
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


 def __extract_links__(self, selector, response_url, response_encoding, base_url) :
    links = []
    for holder, attr, content in self._iter_links(selector._root):
        absolute_url = urljoin(base_url, content.strip())
        link_url = self.process_attr(absolute_url)
        if link_url is not None:
            if isinstance(link_url, unicode):
                link_url = link_url.encode(response_encoding)
            abs_url = urljoin(response_url, link_url)
            link = Link(abs_url, _collect_string_content(holder) or u'',
                        nofollow = (holder.get('rel') == 'nofollow'))
            links.append(link)
    return unique_list(links, key = lambda link: link.url) if self.unique else links
