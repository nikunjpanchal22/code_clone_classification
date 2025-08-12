def do_loop(self) :
	for line in self.connections [0].iter_lines() :
		if self.new_conn.is_set() :
			break
		print line



def do_loop(self) :
    index=0
    while not self.new_conn.is_set() and index < len(self.connections[0].iter_lines()):
        print(self.connections[0].iter_lines()[index])


