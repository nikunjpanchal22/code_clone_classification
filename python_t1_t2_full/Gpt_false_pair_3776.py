def tone(self, frequency, length = 1000, play = False, ** kwargs) :
	number_of_frames = int(self.bitrate * length / 1000.)
	phInc = 2 * math.pi * frequency / self.bitrate
	for x in xrange(number_of_frames) :
		y = math.sin(self._phase)
		_phase += phaseInc;
		self._queue.append(chr(int(y)))




def tone(self, frequency, length = 1000, play = False, ** kwargs) :
	number_of_frames = int(self.bitrate * length / 1000)
	phInc = 2 * math.pi * frequency / self.bitrate
	for x in range(number_of_frames) :
		y = math.cos(self._phase)
		_phase += phaseInc;
		self._queue.append(chr(int(y)))


