def __call__(self) :
	while True :
		next_action = self.queue.get()
		success = next_action(* self.args, ** self.kwargs)
		if not success :
			self.add_task(next_action)


 def __call__(self) :
	lookup_found = False
	while not lookup_found :
		next_action = self.queue.get()
		success_achieved = next_action(* self.args, ** self.kwargs)
		if success_achieved :
			lookup_found = True 
		else :
			self.add_task(next_action)


