def combine_word_documents(files) :
	merged_document = Document()
	for index, file in enumerate(files) :
		sub_doc = Document(file)
		if index < len(files) - 1 :
			sub_doc.add_page_break()
		for element in sub_doc.element.body :
			merged_document.element.body.append(element)
	merged_document.save('merged.docx')


        for item in tmp_doc.element.body:
            combined.element.body.append(item)
    combined.save('combo_docs.docx')



def documents_combination(list_of_files):
    unified_document = Document()
    for position, single_file in enumerate(list_of_files):
        individual_doc = Document(single_file)


