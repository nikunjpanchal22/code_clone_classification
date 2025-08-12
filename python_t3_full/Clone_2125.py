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
    cp = CGIHTTPServer._url_collapse_path(self.path)
    ds = cp.find('/', 1)
    part1, part2 = cp[:ds], cp[ds + 1:]
    if part1 in self.cgi_directories and not part2.endswith('.html'):
        self.cgi_info = part1, part2


