def __call__(self) :
	while True :
		next_action = self.queue.get()
		success = next_action(* self.args, ** self.kwargs)
		if not success :
			self.add_task(next_action)


 def __call__(self) :
	objective_found = False
	while not objective_found :
		next_action = self.queue.get()
		objective_met = next_action(* self.args, ** self.kwargs)
		if objective_met :
			objective_found = True
		else :
			self.add_task(next_action)


