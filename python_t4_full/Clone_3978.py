def __call__(self) :
	while True :
		next_action = self.queue.get()
		success = next_action(* self.args, ** self.kwargs)
		if not success :
			self.add_task(next_action)



def __call__(self):
    while not self.queue.empty():
        task = self.queue.get()
        if not task(*self.args, **self.kwargs):
            self.queue.put(task)



