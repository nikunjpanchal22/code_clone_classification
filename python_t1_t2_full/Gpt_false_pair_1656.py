def run(self) :
	while True :
		image = self.tasks_q.get()
		time.sleep(1)
		self.results_q.put("text")


 def run(self) :
    while self.tasks_q:
        img = self.tasks_q.get()
        time.sleep(1)
        self.results_q.put("text")
