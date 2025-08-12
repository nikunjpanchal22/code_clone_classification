def is_cgi(self) :
	collapsed_path = CGIHTTPServer._url_collapse_path(self.path)
	dir_sep = collapsed_path.find('/', 1)
	head, tail = collapsed_path [: dir_sep], collapsed_path [dir_sep + 1 :]
	if head in self.cgi_directories :
		if not tail.endswith('.html') :
			self.cgi_info = head, tail
			return True
	return False


 def is_cgi(self) :
    collapsed_path = CGIHTTPServer._url_collapse_path(self.path)
    directory_separation = collapsed_path.find('/', 1)
    head_part, tail_part = collapsed_path [: directory_separation], collapsed_path [directory_separation + 1 :]
    if head_part in self.cgi_directories :
        if not tail_part.rstrip().endswith('.html') :
            self.cgi_info = head_part, tail_part
            return True
    return False
