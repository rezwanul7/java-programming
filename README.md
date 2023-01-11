# Poor Man's Java Built-in Concepts
Resembling some built in java concepts in poor man's way.

## Foreach
### Try - 1
Trying to build an **Internal Iterator** using MyIterator class having a single **foreach** method and Consuming it using PrintAction class

### Try - 2
- Creating **ConsumerInterface** to support multiple implementation of the consumer  i.e. PrintConsumer, Print2xConsumer
- ConsumerInterface is having a non-overriding single abstract method, so it can be considered as a **Functional Interface**
- So now, we can use **lambda expression** for one time foreach consumption usage here. 
