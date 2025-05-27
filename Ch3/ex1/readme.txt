creating relationship between beans using method call that returns instance of a bean from context inside another method
- spring looks if bean exists inside it context then returns reference to it
- else it call the method and create the bean, put it in context, then return reference to it. 