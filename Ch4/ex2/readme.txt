in this example we are going to implement scenario using spring (Dependency Injection)
we need the following
we need application to manage team tasks .
1- allow users to leave comment for tasks .
2- when user publish comment, it stored somewhere .
3- app sends email to specific address configured in the app .

**update
now we are going to use dependency injection to inject the beans from context

*changes*
- add context dependency , Annotation dependency , configuration class
1- add annotations on top of classes to create bean .
2- in main class, no need to declare new instances from classes.