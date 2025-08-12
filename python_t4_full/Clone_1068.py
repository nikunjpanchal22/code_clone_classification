def do_loop(self) :
	for line in self.connections [0].iter_lines() :
		if self.new_conn.is_set() :
			break
		print(line)


 def do_loop(self) :
    for line in takewhile(lambda x: self.new_conn.is_set() is False, self.connections[0].iter_lines()):
        print(line)


