def run(self) :
	while True :
		image = self.tasks_q.get()
		time.sleep(1)
		self.results_q.put("text")


 def run(self) :
    for i in range(self.tasks_q.qsize()):
        img = self.tasks_q.get()
        time.sleep(1)
        self.results_q.put("text")
