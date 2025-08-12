def run(self) :
	while True :
		image = self.tasks_q.get()
		time.sleep(1)
		self.results_q.put("text")


 def run(self) :
    while True:
        img = self.tasks_q.get()
        time.sleep(1)
        result = self.transform(img)
        self.results_q.put(result)


