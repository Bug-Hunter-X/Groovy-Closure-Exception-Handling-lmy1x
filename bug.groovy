```groovy
def myMethod(Closure closure) {
  println "Before closure execution"
  closure()
  println "After closure execution"
}

myMethod { println "Inside closure" }

// Unexpected behavior if closure throws an exception
myMethod { throw new RuntimeException("Something went wrong") }
```