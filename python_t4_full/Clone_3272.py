def calculate_speed(radius) :
	global speeds, speed_idx
	t1 = time.time()
	speeds [speed_idx] = radius / (t1 - t0)
	print (sum(speeds) / iterations, 'mm/sek')
	speed_idx += 1
	speed_idx %= iterations


Python
def calculate_speed(radius):
	t0 = time.time()
	sleep(1)  # pause for 1 second
	t1 = time.time()
	speeds = [radius/(t1-t0)]*10
	speed_idx = 0


