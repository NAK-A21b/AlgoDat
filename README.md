Interfaces und Tests befinden sich im [libs](./libs) Ordner.

Es sollte Java 17 verwendet werden (Von IntelliJ gelieferte JRE reicht).

Falls kein Javadoc angezeigt wird, müssen die Sources hinzugefügt werden:
1. File -> Project Structure -> Modules -> AlgoDat -> main
2. Bei Dependency algodat-interfaces-1.0-SNAPSHOT.jar -> Rechtsklick -> edit -> + -> libs/interfaces.zip -> ok -> ok
3. Bei Dependency algodat-tests-1.0-SNAPSHOT.jar -> Rechtsklick -> edit -> + -> libs/tests.zip -> ok -> ok