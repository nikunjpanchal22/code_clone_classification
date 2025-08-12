def __call__(self) :
	while True :
		next_action = self.queue.get()
		success = next_action(* self.args, ** self.kwargs)
		if not success :
			self.add_task(next_action)


 

def __call__(self) :
    while True :
        self.queue, self.next_action = self.next_action(), self.queue
        if not self.queue(*self.args, **self.kwargs):
            self.next_action.add(self.queue)


