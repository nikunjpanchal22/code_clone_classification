def __call__(self) :
	while True :
		next_action = self.queue.get()
		success = next_action(* self.args, ** self.kwargs)
		if not success :
			self.add_task(next_action)


 def __call__(self) : 
	action_found = False
	while not action_found :
		next_action = self.queue.get()
		success = next_action(* self.args, ** self.kwargs)
		if success : 
			action_found = True
		else :
			self.add_task(next_action)


