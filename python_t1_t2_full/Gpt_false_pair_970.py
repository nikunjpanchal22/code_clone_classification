def is_cgi(self) :
	collapsed_path = CGIHTTPServer._url_collapse_path(self.path)
	dir_sep = collapsed_path.find('/', 1)
	head, tail = collapsed_path [: dir_sep], collapsed_path [dir_sep + 1 :]
	if head in self.cgi_directories :
		if not tail.endswith('.html') :
			self.cgi_info = head, tail
			return True
	return False


 def is_cgi(self):
	collapsed_p = CGIHTTPServer._url_collapse_path(self.path)
	dir_spl = collapsed_p.find('/', 1)
	head, tail = collapsed_p[:dir_spl], collapsed_p[dir_spl+1:]
	if head in self.cgi_directories and not tail.rstrip().endswith('.html'):
		self.cgi_info = head, tail
		return True
	else:
		return False
