def __call__(self) :
	while True :
		next_action = self.queue.get()
		success = next_action(* self.args, ** self.kwargs)
		if not success :
			self.add_task(next_action)




def __call__(self):
	while True:
		next_action = self.queue.get()
		if next_action:
			result = next_action(* self.args, ** self.kwargs)
			if not result:
				self.add_task(next_action)
