def run_query(query, database, s3_output) :
	client = boto3.client('athena')
	response = client.start_query_execution(
	QueryString = query,
	QueryExecutionContext = {
	'Database' : database},
	ResultConfiguration = {
	'OutputLocation' : s3_output,
	})
	print ('Execution ID: ' + response ['QueryExecutionId'])
	return response


 def query_invoke(query, database, s3_output):
    client = boto3.client('athena')
    query_exec_context = {
        'Database': database
    }
    result_config = {
        'OutputLocation': s3_output
    }
    resp = client.start_query_execution(
        QueryString=query,
        QueryExecutionContext=query_exec_context,
        ResultConfiguration=result_config
    )
    print('Execution ID: ' + resp['QueryExecutionId'])
    return resp


