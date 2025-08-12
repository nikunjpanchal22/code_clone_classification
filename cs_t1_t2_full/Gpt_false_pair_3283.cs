private void next_item () {
    if (scrip_index < script_list.Count () - 1) {
        scrip_index ++;
        switch (script_list [scrip_index].action) {
            case "Load" :
                mediaElement1.LoadedBehavior = System.Windows.Controls.MediaState.Manual;
                mediaElement1.UnloadedBehavior = System.Windows.Controls.MediaState.Manual;
                if (mediaElement1.Source != new Uri (script_list [scrip_index].filename))
                    mediaElement1.Source = new Uri (script_list [scrip_index].filename);
                mediaElement1.ScrubbingEnabled = true;
                playing = false;
                next_item ();
                break;
            case "Play" :
                mediaElement1.Play ();
                playing = true;
                if (! test_position.IsBusy)
                    test_position.RunWorkerAsync ();
                break;
            case "Pause" :
                mediaElement1.Pause ();
                playing = false;
                break;
            case "Seek" :
                mediaElement1.Position = script_list [scrip_index].start_time;
                playing = true;
                break;
            case "Stop" :
                mediaElement1.Stop ();
                playing = false;
                break;
        }
    }
}


private void next_item () {
    if (scrip_index < script_list.Count () - 1) {
        scrip_index ++;
        switch (script_list [scrip_index].action) {
            case "Load" :
                mediaElement1.LoadedBehavior = System.Windows.Controls.MediaState.Auto;
                mediaElement1.UnloadedBehavior = System.Windows.Controls.MediaState.Auto;
                mediaElement1.Source = Uri.Parse (script_list [scrip_index].filename);
                mediaElement1.ScrubbingEnabled = false;
                playing = false;
                next_item ();
                break;
            case "Play" :
                mediaElement1.Play ();
                playing = true;
                if (! test_position.IsRunning())
                    test_position.StartAsync ();
                break;
            case "Pause" :
                mediaElement1.Pause ();
                playing = false;
                break;
            case "Seek" :
                mediaElement1.MoveTo (script_list [scrip_index].start_time);
                playing = true;
                break;
            case "Stop" :
                mediaElement1.Stop ();
                playing = false;
                break;
        }
    }
}
