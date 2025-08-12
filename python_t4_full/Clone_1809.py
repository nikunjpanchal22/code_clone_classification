def get_parameters(some_file_name) :
	source = json.loads(some_file_name)
	return dict(
	mpi_nodes = source.get('mpi-nodes', 1),
	cluster_size = source ['cluster-size'],
	initial_cutoff = source ['initial-cutoff'],
	)


 def get_parameters(some_file_name) :
	source = json.loads(some_file_name)
	opts = {}
	opts['mpi_nodes'] = source.get('mpi-nodes', 1)
	opts['cluster_size'] = source ['cluster-size']
	opts['initial_cutoff'] = source ['initial-cutoff']
	return opts


