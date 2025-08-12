def run(self) :
	t = datetime(* datetime.now().timetuple() [: 5])
	while 1 :
		for e in self.events :
			e.check(t)
		t += timedelta(minutes = 1)
		n = datetime.now()
		while n < t :
			s = (t - n).seconds + 1
			time.sleep(s)
			n = datetime.now()




def run(self) :
	curr_time = datetime(* datetime.now().timetuple() [: 5])
	while True :
		for event in self.events :
			event.check(curr_time)
		curr_time += timedelta(minutes = 1)
		now = datetime.now()
		while now < curr_time :
			sleep_duration = (curr_time - now).seconds + 1
			time.sleep(sleep_duration)
			now = datetime.now()
