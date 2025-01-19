# Groovy NullPointerException in eachWithIndex

This example demonstrates a NullPointerException that can occur when using the `eachWithIndex` method with a null list in Groovy.  The `eachWithIndex` method doesn't handle null input gracefully, resulting in a runtime exception.

**File: bug.groovy** contains the buggy code.  **File: bugSolution.groovy** provides the solution.

The solution demonstrates how to safely handle null input by adding a null check before proceeding with the iteration.