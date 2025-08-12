def get_parameters(some_file_name) :
	source = json.loads(some_file_name)
	return dict(
	mpi_nodes = source.get('mpi-nodes', 1),
	cluster_size = source ['cluster-size'],
	initial_cutoff = source ['initial-cutoff'],
	)


 def get_parameters(some_file_name) :
	source = json.loads(some_file_name)
	args = {}
	args['mpi_nodes'] = source.get('mpi-nodes', 1)
	args['cluster_size'] = source ['cluster-size']
	args['initial_cutoff'] = source ['initial-cutoff']
	return args


