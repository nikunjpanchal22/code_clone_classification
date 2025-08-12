def do_loop(self) :
	for line in self.connections [0].iter_lines() :
		if self.new_conn.is_set() :
			break
		print line


        print(next(iterator))



def do_loop(self) :
    lines = iter(self.connections[0].iter_lines())
    while True:
        line = next(lines, None)


