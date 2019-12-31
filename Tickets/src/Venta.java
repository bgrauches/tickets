import java.util.Scanner;

public class Venta {
	//Declaram numero d'entrades
	static Zona platea = new Zona (1000); 
	static Zona anfiteatre = new Zona (200);
    static Zona VIP = new Zona (25);
    
    //METODE MENU
    public static int showMenu() {
    	System.out.println("Elija una opcion: ");
        System.out.println("1. Mostrar entradas");
        System.out.println("2. Comprar entradas");
        System.out.println("3. Salir");
        
        Scanner scanMenu = new Scanner(System.in);
        int opcion = scanMenu.nextInt();
        return opcion;
    }
    
    //Metode opcio 1
    public static void mostrarEntrades(){
    	System.out.println("Entrades disponibles a la platea: "+ platea.getEntradesPerVendre());
        System.out.println("Entrades disponibles a l'anfiteatre: "+ anfiteatre.getEntradesPerVendre());
        System.out.println("Entrades disponibles al VIP: " + VIP.getEntradesPerVendre());
    }
    
    //Metode opcio 2
    public static int vendreEntrades() {
    	
    	System.out.println("1- Zona platea");
        System.out.println("2- Zona anfiteatre");
        System.out.println("3- Zona VIP");
        System.out.println("4- Atras");

        Scanner scanZona = new Scanner(System.in);
        System.out.println("Quina zona vol?");
        int ventaZona = scanZona.nextInt();
        
        Scanner scanEntrades = new Scanner(System.in);
        
        
        boolean atras = false;
        
        
        	switch(ventaZona) {
        	case 1:
        		System.out.println("Está a la platea, numero d'enrades?");
        		int plat = scanEntrades.nextInt();
        		platea.vendre(plat);
        		break;
        	
        	case 2:
        		System.out.println("Está a l'anfiteatre, numero d'enrades?");
        		int anfi = scanEntrades.nextInt();
        		anfiteatre.vendre(anfi);
        		break;
        		
        	case 3:
        		System.out.println("Está al VIP, numero d'enrades?");
        		int vipe = scanEntrades.nextInt();
        		VIP.vendre(vipe);
        		break;
        		
        	case 4:
        		atras = true;
        		break;
        	
        	default:
        		System.out.println("Opcions disponibles 1, 2, 3 o 4.");
        	}
        
		return ventaZona;
    }

	public static void main(String[] args) {
		boolean Salir = false;
		
		while (Salir == false) {
			int opcion = showMenu();
			
			switch(opcion) {
			case 1:
				mostrarEntrades();
				break;
			
			case 2:
				vendreEntrades();
				break;
				
			case 3:
				Salir = true;
				System.out.println("Gracies, vagi bé.");
				break;
				
			default:
				System.out.println("Opcions disponibles 1, 2 o 3.");
			}
		}

	}

}
