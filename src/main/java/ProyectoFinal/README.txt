
########
Para iniciar sesion en la aplicacion, antes debe configurar los parametros del sistema de gestión
de base de datos que se usará
########
Paso 1 : 

Entrar en el fichero OracleEnlace.java y modificar las variables estáticas por sus propios parámetros
Estos son:

public static final  String DRIVER = "oracle.jdbc.driver.OracleDriver";;
public static final String URL = "jdbc:oracle:thin:@localhost:1521:ORCL";
public  static final String USER ="system";
public static final String PASS = "system";


#######
Paso 2 : 

Una vez inicie el programa, este le pedirá un usuario y contraseña, usted debe usar el usuario y
contraseña que use para acceder a su base de datos (que previamente habrá modificado).
#######
