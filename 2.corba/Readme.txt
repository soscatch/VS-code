Terminal 1
idlj -fall Calc.idl
javac CalcClient.java
javac CalcServer.java
orbd -ORBInitialPort 1050

terminal 2
java CalcServer -ORBInitialPort 1050 -ORBInitialHost localhost

terminal 3
java CalcClient -ORBInitialPort 1050 -ORBInitialHost localhost
