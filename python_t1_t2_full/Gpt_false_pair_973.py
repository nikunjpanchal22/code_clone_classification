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
    dir_split_index = collapsed_path.find('/', 1)
    head_ele, tail_ele = collapsed_path[:dir_split_index], collapsed_path[dir_split_index+1:]
    if head_ele in self.cgi_directories and not tail_ele.strip().endswith('.html'):
        self.cgi_info = head_ele, tail_ele
        return True
    else:
        return False
