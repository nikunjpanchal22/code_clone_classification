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
    }}


 public static void Main (string [] args) {
    using (var db = new BloggingContext ())
    {
        for (int i = 0; i < 10; ++ i) {
            var blog = new Blog () {};
            db.Blogs.Add (blog);
            db.ValidateChanges ();
        }
        for (int i = 0; i < 10; ++ i) {
            var fkBlog = GetBlog (db);
            var post = new Post () {};
            db.Posts.Add (post);
            db.ValidateChanges ();
        }
    }
}
