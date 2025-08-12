def get_parameters(some_file_name) :
	source = json.loads(some_file_name)
	return dict(
	mpi_nodes = source.get('mpi-nodes', 1),
	cluster_size = source ['cluster-size'],
	initial_cutoff = source ['initial-cutoff'],
	)


 def get_parameters(some_file_name) :
	source = json.loads(some_file_name)
	params = {}
	params['mpi_nodes'] = source.get('mpi-nodes', 1)
	params['cluster_size'] = source ['cluster-size']
	params['initial_cutoff'] = source ['initial-cutoff']
	return params


