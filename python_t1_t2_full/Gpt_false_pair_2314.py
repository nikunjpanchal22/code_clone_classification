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
	t = datetime(* datetime.now().timetuple() [: 5])
	while 1 :
		for event in self.events :
			event.check(t)
		t += timedelta(minutes = 1)
		n = datetime.now()
		while n < t :
			sleep_time = (t - n).seconds + 1
			time.sleep(sleep_time)
			n = datetime.now()

