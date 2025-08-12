def __call__(self) :
	while True :
		next_action = self.queue.get()
		success = next_action(* self.args, ** self.kwargs)
		if not success :
			self.add_task(next_action)


 def __call__(self) :
	task_completed = False
	while not task_completed :
		next_action = self.queue.get()
		action_succeeded = next_action(* self.args, ** self.kwargs)
		if action_succeeded :
			task_completed = True
		else :
			self.add_task(next_action)


