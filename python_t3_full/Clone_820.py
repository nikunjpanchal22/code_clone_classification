def __call__(self) :
	while True :
		next_action = self.queue.get()
		success = next_action(* self.args, ** self.kwargs)
		if not success :
			self.add_task(next_action)


 def __call__(self) :
	still_searching = True
	while still_searching :
		next_action = self.queue.get()
		successful_action = next_action(* self.args, ** self.kwargs)
		if successful_action :
			still_searching = False
		else : 
			self.add_task(next_action)


