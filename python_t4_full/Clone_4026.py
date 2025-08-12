def is_cgi(self) :
	collapsed_path = CGIHTTPServer._url_collapse_path(self.path)
	dir_sep = collapsed_path.find('/', 1)
	head, tail = collapsed_path [: dir_sep], collapsed_path [dir_sep + 1 :]
	if head in self.cgi_directories :
		if not tail.endswith('.html') :
			self.cgi_info = head, tail
			return True
	return False


        self.cgi_info = head_tail
        return True
    return False



def is_cgi(self):
    collapse_path = CGIHTTPServer._url_collapse_path(self.path)
    separator_index = collapse_path.find('/', 1)


