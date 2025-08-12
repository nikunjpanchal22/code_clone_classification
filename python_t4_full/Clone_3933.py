def do_loop(self) :
	for line in self.connections [0].iter_lines() :
		if self.new_conn.is_set() :
			break
		print line



def do_loop(self):
    lines_generator = (line for line in self.connections[0].iter_lines())
    while not self.new_conn.is_set():
        print(next(lines_generator))



