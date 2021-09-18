class Cuenta{
	private String nombreTitular;
	private double saldoCuenta;
	private int pin;
	
	public Cuenta(String nombreTitular, double saldoCuenta, int pin){
		this.nombreTitular = nombreTitular;
		this.saldoCuenta = saldoCuenta;
		this.pin = pin;
	}
	
	//método para depositar
	public void depositoCuenta(){
		double deposito;
		
		deposito = CapturaEntrada.capturaDouble("Cantidad que desea depositar: ");
		saldoCuenta = deposito + saldoCuenta;
	}
	
	public void retiroCuenta(){
		double retiro;
		
		retiro = CapturaEntrada.capturaDouble("Cantidad que desea retirar: ");
		if((saldoCuenta - retiro) < 0){
			System.out.println("Saldo insuficiente...");
		}else{
			saldoCuenta = saldoCuenta - retiro;
		}
	}
		
	public String getNombreTitular(){
		return nombreTitular;
	}
	
	public double getSaldoCuenta(){
		return saldoCuenta;
	}
	
	public int getPin(){
		return pin;
	}
}