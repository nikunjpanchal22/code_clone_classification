def run(self) :
	while True :
		image = self.tasks_q.get()
		time.sleep(1)
		self.results_q.put("text")


 def run(self) :
    for image in iter(self.tasks_q.get, None):
        time.sleep(1)
        self.results_q.put("text")


