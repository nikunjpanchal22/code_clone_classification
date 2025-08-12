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
    directory_separation = collapsed_path.find('/', 1)
    head_seg, tail_seg = collapsed_path [: directory_separation], collapsed_path [directory_separation + 1 :]
    if head_seg in self.cgi_directories :
        if not tail_seg.lstrip().endswith('.html') :
            self.cgi_info = head_seg, tail_seg
            return True
    return False
