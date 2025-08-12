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


#3. Using pathslib
def urls() :
    import csv
    from pathlib import Path
    from sqlite3 import connect

    database_path = Path('C:\Users\username\Desktop\History.sql')
    output_file_path = Path('C:\Users\username\Desktop\\historyulrs.csv')

    conn = connect(database_path)
    c = conn.cursor()
    query = "SELECT url, title FROM urls"
    c.execute(query)
    data = c.fetchall()

    if data:
        with open(output_file_path, 'w', newline='') as outfile:
            writer = csv.writer(outfile)
            writer.writerow(['URL', 'Title'])
            writer.writerows(data)


