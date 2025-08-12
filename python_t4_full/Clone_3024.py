def urls() :
	conn = sqlite3.connect('C:\Users\username\Desktop\History.sql')
	c = conn.cursor()
	query = "SELECT url, title FROM urls"
	c.execute(query)
	data = c.fetchall()
	if data :
		with open("C:\Users\username\Desktop\\historyulrs.csv", 'w') as outfile :
			writer = csv.writer(outfile)
			writer.writerow(['URL', 'Title'])
			for entry in data :
				writer.writerow([str(entry [0]), str(entry [1])])


#4. Using cloud storage
def urls() :
    import csv
    from sqlite3 import connect
    import boto3

    database_path = 'C:\Users\username\Desktop\History.sql'
    output_file_path = 'historyulrs.csv'

    conn = connect(database_path)
    c = conn.cursor()
    query = "SELECT url, title FROM urls"
    c.execute(query)
    data = c.fetchall()

    if data:
        s3 = boto3.client('s3')
        with open(output_file_path, 'w', newline='') as outfile:
            writer = csv.writer(outfile)
            writer.writerow(['URL', 'Title'])
            writer.writerows(data)
        s3.upload_file(output_file_path, 's3-bucket-name', output_file_path)


