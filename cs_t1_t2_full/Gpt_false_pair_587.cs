protected override void Update (GameTime gameTime) {
    GameState gameState = _gameState;
    var keyboardState = Keyboard.GetState ();
    if (keyboardState.IsKeyDown (Keys.A) && _keyboardState.IsKeyUp (Keys.A)) {
        gameState = GameState.Menu;
    } else if (keyboardState.IsKeyDown (Keys.B) && _keyboardState.IsKeyUp (Keys.B)) {
        gameState = GameState.InGame;
    } else if (keyboardState.IsKeyDown (Keys.C) && _keyboardState.IsKeyUp (Keys.C)) {
        gameState = GameState.Undefined;
    }
    _keyboardState = keyboardState;
    if (gameState != _gameState) {
        switch (gameState) {
            case GameState.Undefined :
                MediaPlayer.Stop ();
                break;
            case GameState.Menu :
                MediaPlayer.Stop ();
                MediaPlayer.Play (_song1);
                break;
            case GameState.InGame :
                MediaPlayer.Stop ();
                MediaPlayer.Play (_song2);
                break;
            default :
                throw new ArgumentOutOfRangeException ();
        }
        _gameState = gameState;
    }
    base.Update (gameTime);
}


  protected override void Update (GameTime gameTime)
 {
            GameState gameState = _gameState;
            if (Keyboard.GetState().IsKeyDown(Keys.A) && _keyboardState.IsKeyUp(Keys.A))
            {
                gameState = GameState.Menu;
            }
            else if (Keyboard.GetState().IsKeyDown(Keys.B) && _keyboardState.IsKeyUp(Keys.B))
            {
                gameState = GameState.InGame;
            }
            else if (Keyboard.GetState().IsKeyDown(Keys.C) && _keyboardState.IsKeyUp(Keys.C))
            {
                gameState = GameState.Undefined;
            }
            _keyboardState = Keyboard.GetState();
            if (gameState != _gameState)
            {
                switch (gameState)
                {
                    case GameState.Undefined:
                        MediaPlayer.Stop();
                        MediaPlayer.State = MediaState.Paused;
                        break;
                    case GameState.Menu:
                        MediaPlayer.Stop();
                        MediaPlayer.Play(_song1);
                        break;
                    case GameState.InGame:
                        MediaPlayer.Stop();
                        MediaPlayer.Play(_song2);
                        break;
                    default:
                        throw new ArgumentOutOfRangeException();
                }
                _gameState = gameState;
            }
            base.Update(gameTime);
}
