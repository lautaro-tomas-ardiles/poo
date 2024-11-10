public class veiculo_constructor {

    private String color;

    veiculo_constructor(String c){
        color = c;
    }

    public static void main(String[] args){

        veiculo_constructor auto = new veiculo_constructor("'caca'");

        System.out.println("el color del auto es " + auto.color);

        veiculo_constructor moto = new veiculo_constructor("'rojo fuego'");

        System.out.println("el color de la moto es " + moto.color);
    }
}