def calculate_speed(radius) :
	global speeds, speed_idx
	t1 = time.time()
	speeds [speed_idx] = radius / (t1 - t0)
	print (sum(speeds) / iterations, 'mm/sek')
	speed_idx += 1
	speed_idx %= iterations




def calculate_velocity(radius) :
	global velocities, vel_idx
	t1 = time.time()
	velocities [vel_idx] = radius / (t1 - t0)
	print (sum(velocities) / iterations, 'm/sec')
	vel_idx += 1
	vel_idx %= iterations
