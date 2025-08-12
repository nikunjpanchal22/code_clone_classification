def __call__(self) :
	while True :
		next_action = self.queue.get()
		success = next_action(* self.args, ** self.kwargs)
		if not success :
			self.add_task(next_action)


 def __call__(self) :
	attempt_found = False
	while not attempt_found :
		next_action = self.queue.get()
		success_attained = next_action(* self.args, ** self.kwargs)
		if success_attained :
			attempt_found = True 
		else : 
			self.add_task(next_action)


