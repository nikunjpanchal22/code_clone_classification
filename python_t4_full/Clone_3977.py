def __call__(self) :
	while True :
		next_action = self.queue.get()
		success = next_action(* self.args, ** self.kwargs)
		if not success :
			self.add_task(next_action)





import threading
def __call__(self):
    while threading.active_count() > 0:
        next_action = self.queue.get()
        success = next_action(*self.args, **self.kwargs)


