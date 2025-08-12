def do_loop(self) :
	for line in self.connections [0].iter_lines() :
		if self.new_conn.is_set() :
			break
		print(line)


 def do_loop(self) :
    while self.connections[0]:
        line = self.connections[0].pop()
        if self.new_conn.is_set():
            break
        print(line)


