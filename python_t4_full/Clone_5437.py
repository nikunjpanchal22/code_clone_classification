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



import boto3
def run_query(query, database, s3_output):
    session = boto3.Session()
    client = session.client('athena')
    result = client.start_query_execution(QueryString=query, QueryExecutionContext={'Database': database}, ResultConfiguration={'OutputLocation': s3_output})
    print('Execution ID:', result['QueryExecutionId'])
    return result




