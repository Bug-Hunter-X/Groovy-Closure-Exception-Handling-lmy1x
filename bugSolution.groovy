```groovy
def myMethod(Closure closure) {
  println "Before closure execution"
  try {
    closure()
  } catch (RuntimeException e) {
    println "Exception caught: ${e.message}"
  }
  println "After closure execution"
}

myMethod { println "Inside closure" }

// Proper exception handling
myMethod { throw new RuntimeException("Something went wrong") }
```