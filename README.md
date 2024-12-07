# Groovy Closure Exception Handling

This example demonstrates a potential issue when using closures in Groovy.  Specifically, it shows that if a closure throws an exception, the code after the closure execution within the calling method may still execute.

The `bug.groovy` file contains the code exhibiting this behavior. The `bugSolution.groovy` file provides a solution.

## Problem

When the `myMethod` function is called with a closure that throws a `RuntimeException`, the exception is not handled correctly.  The 'After closure execution' message is printed even after the exception occurs, which can lead to unexpected results and make debugging difficult.

## Solution

The `bugSolution.groovy` file shows how to add explicit exception handling (a `try-catch` block) to handle potential exceptions thrown by the closure, preventing unexpected behavior.