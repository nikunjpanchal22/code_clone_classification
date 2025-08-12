def is_cgi(self) :
	collapsed_path = CGIHTTPServer._url_collapse_path(self.path)
	dir_sep = collapsed_path.find('/', 1)
	head, tail = collapsed_path [: dir_sep], collapsed_path [dir_sep + 1 :]
	if head in self.cgi_directories :
		if not tail.endswith('.html') :
			self.cgi_info = head, tail
			return True
	return False


    return False



def is_cgi(self):
    col_path = CGIHTTPServer._url_collapse_path(self.path)
    find_dir = col_path.find('/', 1)
    lead, trail = col_path[:find_dir], col_path[find_dir + 1:]
    if (lead in self.cgi_directories) and (not trail.endswith('.html')):
        self.cgi_info = lead, trail


