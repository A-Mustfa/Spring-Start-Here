creating relationship between beans using @AutoWired Annotation with class field
- in this way we instruct spring to inject dependency (bean, value) from its context with the same type as field identifier;
- used most with examples.
- not good in real world apps, cause you can't make fields final to restrict others from editing it.