SET JAVA_HOME = "C:\Program Files\Java\jdk-21\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
SET JFLEX_HOME= C:\Users\david\Desktop\Recursos\jflex-1.9.1\lib
cd C:\Users\david\Documents\CUNOC\Ingenieria en Ciencias y Sistemas\2024\02-Semestre\Compiladores 1\Laboratorio\Practica 1\Practica 1\GraficadorGeometrico\src\main\java\org\zafkiel\backend\analizadores
java -jar %JFLEX_HOME%\jflex-full-1.9.1.jar A_Lexico.jflex
pause