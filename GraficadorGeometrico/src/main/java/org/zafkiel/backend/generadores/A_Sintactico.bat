SET JAVA_HOME = "C:\Program Files\Java\jdk-21\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
SET CUP_HOME= C:\Users\david\Desktop\Recursos\java-cup-11b.jar
cd C:\Users\david\Documents\CUNOC\Ingenieria en Ciencias y Sistemas\2024\02-Semestre\Compiladores 1\Laboratorio\Practica 1\Practica 1\GraficadorGeometrico\src\main\java\org\zafkiel\backend\analizadores
java -jar %CUP_HOME% -parser parser -symbols sym A_Sintactico.cup
pause