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


#10. Using os module
def urls() :
    import sqlite3
    import csv
    import os

    database_path = os.path.join('C:\Users\username\Desktop', 'History.sql')
    output_path = os.path.join('C:\Users\username\Desktop', 'historyulrs.csv')

    conn = sqlite3.connect(database_path)
    c = conn.cursor()
    query = "SELECT url, title FROM urls"
    c.execute(query)
    data = c.fetchall()

    if data:
        with open(output_path, 'w', newline='') as outfile:
            writer = csv.writer(outfile)
            writer.writerow(['URL', 'Title'])


