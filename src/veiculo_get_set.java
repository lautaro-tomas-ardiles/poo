public class veiculo_get_set {

    private String color;
    private String vocina;
    private int ruedas;
    private int Vmax;

    public String Getcolor(){
        return color;
    }
    public String Getvocina(){
        return vocina;
    }
    public int Getruedas(){
        return ruedas;
    }
    public int GetVmax(){
        return Vmax;
    }

    public void Setcolor(String c){
        this.color = c;
    }
    public void Setvocina(String v){
        this.vocina = v;
    }
    public void SetVmax(int v){
        this.Vmax = v;
    }
    public void Setruedas(int r){
        this.ruedas = r;
    }

        public static void main(String[] args) {

            veiculo_get_set auto = new veiculo_get_set();

            auto.Setcolor("negro");

            auto.Setvocina("chu-chu");

            auto.Setruedas(4);

            auto.SetVmax(100);

            System.out.println("color del auto : " + auto.Getcolor());

            System.out.println("ruido de vocina : " + auto.Getvocina());

            System.out.println("numero de ruedas : " + auto.Getruedas());

            System.out.println("velocida maxima : " + auto.GetVmax());

            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");

            veiculo_get_set moto = new veiculo_get_set();

            moto.Setcolor("rojo");

            moto.Setvocina("no se que pongo en la vocina");

            moto.Setruedas(2);

            moto.SetVmax(70);

            System.out.println("color del moto : " + moto.Getcolor());

            System.out.println("ruido de vocina : " + moto.Getvocina());

            System.out.println("numero de ruedas : " + moto.Getruedas());

            System.out.println("velocida maxima : " + moto.GetVmax());
    }
}