def do_loop(self) :
	for line in self.connections [0].iter_lines() :
		if self.new_conn.is_set() :
			break
		print(line)


 def do_loop(self) :
    for line in filter(self.connections[0].is_set, self.connections [0].iter_lines()):
        print(line)


