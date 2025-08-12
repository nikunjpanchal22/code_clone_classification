public static ILog GetLogger (string arg, string name) {
    var repositoryName = arg;
    ILoggerRepository repository = null;
    var repositories = LogManager.GetAllRepositories ();
    foreach (var loggerRepository in repositories) {
        if (loggerRepository.Name.Equals (repositoryName)) {
            repository = loggerRepository;
            break;
        }
    }
    Hierarchy hierarchy = null;
    if (repository == null) {
        repository = LogManager.CreateRepository (repositoryName);
        hierarchy = (Hierarchy) repository;
        hierarchy.Root.Additivity = false;
        var rollingAppender = GetRollingAppender (repositoryName);
        hierarchy.Root.AddAppender (rollingAppender);
        var memoryAppender = GetMemoryAppender (repositoryName);
        hierarchy.Root.AddAppender (memoryAppender);
        BasicConfigurator.Configure (repository);
    }
    return LogManager.GetLogger (repositoryName, name);
}


 public static ILog GetLogger(string arg, string name)
    {
        string repositoryName = arg;
        ILoggerRepository repository = null;
        var repositories = LogManager.GetAllRepositories();
        foreach (ILoggerRepository loggerRepository in repositories)
        {
            if (loggerRepository.Name.Equals(repositoryName))
            {
                repository = loggerRepository;
                break;
            }
        }
        if (repository == null)
        {
            repository = LogManager.CreateRepository(repositoryName);
            var hierarchy = (Hierarchy)repository;
            hierarchy.Root.Additivity = false;
            var rollingAppender = GetRollingAppender(repositoryName);
            hierarchy.Root.AddAppender(rollingAppender);
            var memoryAppender = GetMemoryAppender(repositoryName);
            hierarchy.Root.AddAppender(memoryAppender);
            BasicConfigurator.Configure(repository);
        }
        Logger logger = repository as Logger;
        logger.Level = Level.Info;
        logger.Additivity = false;
        return LogManager.GetLogger(repositoryName, name);
    }

 public static ILog GetLogger (String arg, String name)
    {
        String repositoryName = arg;
        ILoggerRepository repository;
        ILoggerRepository[] repositories = LogManager.GetAllRepositories();
        foreach (ILoggerRepository loggerRepository in repositories)
        {
            if (loggerRepository.Name.Equals(repositoryName))
            {
                repository = loggerRepository;
                break;
            }
        }
        if (repository == null)
        {
            repository = LogManager.CreateRepository(repositoryName);
            Hierarchy hierarchy = (Hierarchy)repository;
            hierarchy.Root.Additivity = false;
            RollingFileAppender rollingAppender = GetRollingAppender(repositoryName);
            hierarchy.Root.AddAppender(rollingAppender);
            MemoryMappedFileAppender memoryAppender = GetMemoryAppender(repositoryName);
            hierarchy.Root.AddAppender(memoryAppender);
            BasicConfigurator.Configure(repository);
        }
        return LogManager.GetLogger(repositoryName, name);
    }

 public static ILog GetLogger (string arg, string name) {
      var repositoryName = arg;
      ILoggerRepository repository;
      var repositories = LogManager.GetAllRepositories();
      foreach (var loggerRepository in repositories)
      {
          if (loggerRepository.Name.Equals(repositoryName))
          {
              repository = loggerRepository;
              break;
          }
      }
      if (repository == null)
      {
          repository = LogManager.CreateRepository(repositoryName);
          var hierarchy = (Hierarchy)repository;
          hierarchy.Root.Additivity = false;
          var rollingAppender = GetRollingAppender(repositoryName);
          hierarchy.Root.AddAppender(rollingAppender);
          var memoryAppender = GetMemoryAppender(repositoryName);
          hierarchy.Root.AddAppender(memoryAppender);
          SimpleConfigurator.Configure(repository);
      }
      return LogManager.GetLogger(repositoryName, name);
  }
