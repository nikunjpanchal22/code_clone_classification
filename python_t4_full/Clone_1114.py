def __call__(self) :
	while True :
		next_action = self.queue.get()
		success = next_action(* self.args, ** self.kwargs)
		if not success :
			self.add_task(next_action)


 def __call__(self) :
	final_action = False
	while not final_action :
		next_action = self.queue.get()
		action_achievement = next_action(* self.args, ** self.kwargs)
		if action_achievement :
			final_action = True
		else :
			self.add_task(next_action)


