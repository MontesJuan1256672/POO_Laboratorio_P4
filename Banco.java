import java.util.Arrays;
class Banco{
	
	public static void main (String[] args){
		int opc;//variable de control para switch del primer menú
		int PIN;
		int opc1;

	
		//declaración de arreglo de objetos tipo Cuenta, con cero elementos
		Cuenta  cuentas[] = new Cuenta[0] ;
		
		do{//cilo para el menú principal 
			System.out.println("\nMenu de opciones.");
			System.out.println("1) Captura una nueva cuenta.");
			System.out.println("2) Desea acceder a una cuenta.");
			System.out.println("3) Salir");
			System.out.println();
			opc = CapturaEntrada.capturaEntero(">>>");
			
			switch(opc){//switch case para el menú principal
			
				case 1:	//inicializar una nueva cuenta
				
						//crea una copia del arreglo con capacidad de un elemento más
						cuentas = Arrays.copyOf(cuentas, cuentas.length + 1);
						
						//agrega un elemento más a la copia del arreglo;
						cuentas[cuentas.length - 1] = new Cuenta(CapturaEntrada.capturaString("Nombre del titular: "), 
																 CapturaEntrada.capturaDouble("Saldo inicial: "),
																 CapturaEntrada.capturaEntero("PIN de seguridad: "));				
						System.out.println("\n");
						break;
						
				case 2:	//solicitar al usuario su pin de seguridad para acceder a una cuenta
						PIN = CapturaEntrada.capturaEntero("Ingrese PIN de seguridad: ");
						for(int i = 0; i < cuentas.length; i++){
							
							//conpara el pin de seguridad con el de los elementos del arreglo, si coinciden accede a la cuenta
							if (cuentas[i].getPin() == PIN){
								System.out.println("Titular: " + cuentas[i].getNombreTitular());
								System.out.println("Saldo acutal: " + cuentas[i].getSaldoCuenta());
								System.out.println("\n");
								
								//submenú una vez que se accede a la cuenta 
								do{
									System.out.println("");
									System.out.println("1) Realizar un deposito a cuenta.");
									System.out.println("2) Realizar un retiro a cuenta.");
									System.out.println("3) Atras");
									System.out.println();
									opc1 = CapturaEntrada.capturaEntero(">>>");
									
									switch(opc1){
										case 1: //el titular pueda retirar o depositar
												//invocar método para hacer deposito
												cuentas[i].depositoCuenta();
												System.out.println("\n");
												break;
										
										case 2:	//invocar método para hacer retiro
												cuentas[i].retiroCuenta();
												System.out.println("\n");
												break;
												
									}//fin del switch del menú secundario (depositos/retiros)
								}while(opc1 != 3);
								
								//saldo despues del retiro/deposito
								System.out.println("Saldo acutal: " + cuentas[i].getSaldoCuenta());
								System.out.println("\n");
							}//fin del if
						}//fin del for
						break;
			}//fin del switch case del menú principal
		}while(opc != 3);	
	}//fin del método main
}//fin de la clase
