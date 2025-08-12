def __call__(self) :
	while True :
		next_action = self.queue.get()
		success = next_action(* self.args, ** self.kwargs)
		if not success :
			self.add_task(next_action)


 def __call__(self) :
	try_found = False
	while not try_found :
		next_action = self.queue.get()
		action_succeded = next_action(* self.args, ** self.kwargs)
		if action_succeded :
			try_found = True
		else :
			self.add_task(next_action)


