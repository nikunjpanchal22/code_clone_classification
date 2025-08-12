def do_loop(self) :
	for line in self.connections [0].iter_lines() :
		if self.new_conn.is_set() :
			break
		print(line)


 def do_loop(self) :
    while self.connections[0].iter_lines():
        line = self.connections[0].next()
        if self.new_conn.is_set():
            break
        print(line)


