def graphWriter() :
	data = {}
	for file in g.glob('*.TXT') :
		data [file] = np.fromregex(file, '\d*\.\d*',
		dtype = [('1', float), ('2', float),
		('3', float), ('4', float)])
	fig, ax = plt.subplots()
	for d in data.itervalues() :
		ax.plot(d ['3'], d ['4'])
	plt.show()
	plt.close(fig)


#gpt output=============
 def graphWriter() :
    data = {}
    for file in g.glob('*.TXT') :
        data [file] = np.fromregex(file, '\d*\.\d*', dtype = [('time', float), ('temp', float), ('humidity', float), ('wind_speed', float)])
    fig, ax = plt.subplots()
    for d in data.itervalues() :
        ax.scatter(d ['humidity'], d ['wind_speed'])
    plt.show()


