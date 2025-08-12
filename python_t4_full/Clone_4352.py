def combine_word_documents(files) :
	combined_document = Document('empty.docx')
	count, number_of_files = 0, len(files)
	for file in files :
		sub_doc = Document(file)
		if count < number_of_files - 1 :
			sub_doc.add_page_break()
		for element in sub_doc._document_part.body._element :
			combined_document._document_part.body._element.append(element)
		count += 1
	combined_document.save('combined_word_documents.docx')




from docx2txt import process
def combine_word_documents(files):
    text = ''
    for file in files:
        text += process(file)
        text += '\n' + '-'*40 +'\n'
    with open('combined_word_documents.docx', 'w') as file:
        file.write(text)


