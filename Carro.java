import javax.swing.event.AncestorEvent;

/* Exericio 
 variavies 
 Marca (string),Modelo(string),Ano de fabricação(int),Velocidade ataul (int)
* */


class Carro {
    protected String Modelo;
    protected String Marca;
    protected int Ano;
    protected int Velocidade;
}
public Carro(String Modelo,int Ano ,String Marca,String Velocidade ) {
    this.Modelo = Modelo;
    this.Marca =Marca;
    this.Ano = Ano;
    this.Velocidade = Velocidade;
    
    
}
 public Chamada Carro  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("HB20");
        String Modelo = scanner.nextLine();

        System.out.println("Hyundai HB20");
        String Marca = scanner. nextInt();

        System.out.println("2020");
        int Ano = scanner. nextInt();

        System.out.println("1.O N TURBO");
        int Velocidade = scanner. nextInt();

        Carro carro = new Carro (Modelo, Ano );
        System. out. println("HB20 " + Modelo.Modelo);
        System. out. println("2020" + Ano. Ano);
    }
}

