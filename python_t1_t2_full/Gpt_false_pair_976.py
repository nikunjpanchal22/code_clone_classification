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
	collapsed_path = CGIHTTPServer._url_collapse_path(self.path)
	dir_division = collapsed_path.find('/', 1)
	part1, part2 = collapsed_path [: dir_division], collapsed_path [dir_division + 1 :]
	if part1 in self.cgi_directories :
		if not part2.strip().endswith('.html') :
			self.cgi_info = part1, part2
			return True
	return False
