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
    while True:
        cur_time = datetime(* datetime.now().timetuple() [: 5])
        for event in self.events:
            event.check(cur_time)
        s_to_wait = timedelta(minutes=1).total_seconds() - datetime.now().timedelta().seconds


