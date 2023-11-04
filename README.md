# Minimal reproducer for JUnit issue #3537

See: https://github.com/junit-team/junit5/issues/3537.

Run with:

```mvn verify```

## Expected output

JUnit 4 @Enclosed tests are executed once when JUnit Vintage runs them as unit tests:

```
[INFO] --- surefire:3.1.2:test (default-test) @ vintage-nested-tests-discovered-twice ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running nestedtests.tests.vintage.VintageEnclosedTests
[INFO] Running nestedtests.tests.vintage.VintageEnclosedTests$EnclosedTests
RUNNING enclosed vintage tests ONCE
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.017 s -- in nestedtests.tests.vintage.VintageEnclosedTests$EnclosedTests
[INFO] Tests run: 0, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.029 s -- in nestedtests.tests.vintage.VintageEnclosedTests
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
```

Using the JUnit Platform Launcher API, the same tests are run twice:

```
RUNNING discovered enclosed vintage tests TWICE
RUNNING discovered enclosed vintage tests TWICE
```
