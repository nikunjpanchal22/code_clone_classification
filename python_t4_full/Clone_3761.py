def ping(host, n = 0) :
	if (n > 0) :
		avg = 0
		for i in range(n) :
			avg += ping(host)
		avg = avg / n
	mp = MultiPing([host])
	mp.send()
	responses, no_responses = mp.receive(1)
	for addr, rtt in responses.items() :
		RTT = rtt
	if no_responses :
		mp.send()
		responses, no_responses = mp.receive(1)
		RTT = - 1
	return RTT


  


def ping(host, n = 0):
    from multiping import MultiPing
    pinger = MultiPing([host])
    RTT = -1 if n else 0
    for _ in range(n):
        pinger.send()
        responses, no_responses = pinger.receive(1)
        if responses: RTT += sum(responses.values()) / len(responses)


