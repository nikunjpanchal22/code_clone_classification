def __call__(self) :
	while True :
		next_action = self.queue.get()
		success = next_action(* self.args, ** self.kwargs)
		if not success :
			self.add_task(next_action)


 def __call__(self) : 
	found_action = False 
	while found_action == False :
		next_action = self.queue.get()
		action_successful = next_action(* self.args, ** self.kwargs)
		if action_successful :
			found_action = True
		else :
			self.add_task(next_action)


