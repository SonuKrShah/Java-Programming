# Collection Framework

It basically is a collection of interfaces and classes.

## Important interfaces and classes

### Collection (Interface)

It is the root interface that all other classes and interfaces uses and it contains common methods for other collection objects.

Eg for common methods: add, remove, contains etc.

#### Collections class

Collections class also contains set of methods that we can use for collection objects. Basically it contains the utility methods for the collections.

> Collection interface is extended by 3 interfaces that are List, Set, Queue.

### List (Interface)

* It extends collection interface.

#### When to use List

* If I have a group of objects that I want to store as a single entity.
* I want to store all the elements in the sorted order or maintain the insertion order.
* Duplicates also allowed

#### Classes that implemented the List interface

* ArrayList
* LinkedList
* Vector (Uses Stack Interface)

> Note: Vector is a legacy class

### Set (Interface)

* It extends collection interface

#### When to use Set

* Insertion order not preserved.
* Duplicates not allowed.

#### Classes that are implemented using Set

* HashSet
* LinkedHashSet

### Queue (Interface)

This can be used when there should be certain priority 

#### Classes that are implemented using Queue

* PriorityQueue

### Map interface

Independent from Collection interface. 

Used to share elements in the form of key value pair

#### When to use Map

## Collection Interface Methods

* add(object)
* add(Collection objects)
* remove(object)
* removeAll(Collection)
* retainAll(Collection)
* clear()
* isEmpty()
* size()
* contains(Object)
* containsAll(Collection)
* toArray(Collection)

## List Methods

* add(Object)
* add(index, object)
* addAll(Collection)
* addAll(index, Collection)
* remove(Object)
* remove(index)
* set(index, value)

## ArrayList

	```
ArrayList<WrapperClass> al = new ArrayList<>();
	```
