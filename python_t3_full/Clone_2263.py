def tone(self, frequency, length = 1000, play = False, ** kwargs) :
	number_of_frames = int(self.bitrate * length / 1000.)
	phInc = 2 * math.pi * frequency / self.bitrate
	for x in xrange(number_of_frames) :
		y = math.sin(self._phase)
		_phase += phaseInc;
		self._queue.append(chr(int(y)))



def tone_10(self, freq, duration = 1000, play = False, ** kwargs) :
	frame_count = int(self.bitRate * duration / 1000.)
	phIncr = 2 * math.pi * freq / self.bitRate
	for _ in range(frame_count) :
		sine_wave = math.sin(self.currentPhase)
		self.currentPhase += phIncr;


