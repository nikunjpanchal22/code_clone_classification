public static void Main (string [] args) {
    using (var db = new BloggingContext ())
    {
        for (int i = 0; i < 10; ++ i) {
            var blog = new Blog () {};
            db.Blogs.Add (blog);
            db.SaveChanges ();
        }
        for (int i = 0; i < 10; ++ i) {
            var fkBlog = GetBlog (db);
            var post = new Post () {};
            db.Posts.Add (post);
            db.SaveChanges ();
        }
    }
}


public static void Main (string [] args) {
    using (var db = new BloggingContext ())
    {
        for (int i = 0; i < 10; ++ i) {
            var blog = new Diary () {};
            db.Diaries.Add (blog);
            db.SaveChanges ();
        }
        for (int i = 0; i < 10; ++ i) {
            var fkBlog = GetDiary (db);
            var post = new Note () {};
            db.Notes.Add (post);
            db.SaveChanges ();
        }
    }
}
