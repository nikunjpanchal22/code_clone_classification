[STAThread] static void Main () {
    Application.EnableVisualStyles ();
    FooConverter.AddProperty ("Time", typeof (DateTime));
    FooConverter.AddProperty ("Age", typeof (int));
    using (var grid = new PropertyGrid {Dock = DockStyle.Fill, SelectedObject = new Foo ()})
    using (var form = new Form {Controls = {grid}})
    {
        Application.Run (form);
    }}


 [STAThread] static void Main () 
{
    Application.EnableVisualStyles ();
    FooConverter.AddProperty ("Gender", typeof (string));
    FooConverter.AddProperty ("ID", typeof (int));
    using (var grid = new PropertyGrid {Dock = DockStyle.Fill, SelectedObject = new Foo ()})
    using (var form = new Form {Controls = {grid}})
    {
        Application.Run (form);
    }
}
