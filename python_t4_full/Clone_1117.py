def __call__(self) :
	while True :
		next_action = self.queue.get()
		success = next_action(* self.args, ** self.kwargs)
		if not success :
			self.add_task(next_action)


 def __call__(self) :
	done_searching = False
	while not done_searching :
		next_action = self.queue.get()
		success_found = next_action(* self.args, ** self.kwargs)
		if success_found :
			done_searching = True
		else :
			self.add_task(next_action)


