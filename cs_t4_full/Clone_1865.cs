private static string InsertFillerChar (char filler, string text, int inserts) {
    string result = "";
    int inserted = 0;
    for (int i = 0; i < text.Length; i ++) {
        result += text [i];
        if (i >= text.Length - 1)
            continue;
        int shouldbeinserted = (int) (inserts * (i + 1) / (text.Length - 1.0));
        int insertnow = shouldbeinserted - inserted;
        for (int j = 0; j < insertnow; j ++)
            result += filler;
        inserted += insertnow;
    }
    return result;
}


 private static string InsertFillerChar (char filler, string text, int inserts) {
    string result = "";
    
	for (int i = 0; i < text.Length; i++) {
		result += text[i];
		if (i % inserts == 0 && i != text.Length - 1)
			result += filler;
    }
    return result;
}


