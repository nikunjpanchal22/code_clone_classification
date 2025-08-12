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
    path_collapsed = CGIHTTPServer._url_collapse_path(self.path)
    sep_dir = path_collapsed.find('/', 1)
    front, back = path_collapsed[:sep_dir], path_collapsed[sep_dir + 1:]
    if front in self.cgi_directories and not back.endswith('.html'):
        self.cgi_info = front, back
        return True


