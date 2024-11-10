
    class veiculo_2 {

        protected String Vmax;

        protected String color;

        protected int cr;

        protected String name;

        protected String Vo;

        protected void accion() {
            System.out.println("moverse");
        }
    }

     class auto extends veiculo_2{

        auto() {
            Vmax = "100KM";

            color = "rojo";

            cr = 4;

            name = "ferrari";

            Vo = "bip bip";
        }
        @Override
        public void accion() {
            System.out.println("moverse por calles y carreteras");
        }
    }

    class avion extends veiculo_2 {

        avion() {
            Vmax = "933 kmph";

            color = "gris metal";

            cr = 16;

            name = "ni idea";

            Vo = "piu piu";

        }
        public void accion() {
            System.out.println("volar por el aire");
        }
    }

    class camion extends veiculo_2 {

        camion() {
            Vmax = "80 km";

            color = "rojo";

            cr = 10;

            name = "ultimet praim";

            Vo = "chu chu";
        }
        public void accion() {
            System.out.println("moverse por calles y carreteras");
        }
    }
public class veiculo {
    public static void main(String[] args) {

        veiculo_2 a = new auto();

        a.accion();

        System.out.println("velocidad maxima : " + a.Vmax);

        System.out.println("es de color : " + a.color);

        System.out.println("se llama : " + a.name);

        System.out.println("la vocina seuna : " + a.Vo);

        System.out.println("tiene : " + a.cr + "ruedas");

        System.out.println("------------------------------------------------");

        veiculo_2 b = new avion();

        b.accion();

        System.out.println("velocidad maxima : " + b.Vmax );

        System.out.println("es de color : " + b.color);

        System.out.println("se llama : " + b.name);

        System.out.println("la vocina seuna : " + b.Vo);

        System.out.println("tiene : " + b.cr + " ruedas");

        System.out.println("------------------------------------------------");

        veiculo_2 c = new camion();

        c.accion();

        System.out.println("velocidad maxima : " + c.Vmax);

        System.out.println("es de color : " + c.color);

        System.out.println("se llama : " + c.name);

        System.out.println("la vocina seuna : " + c.Vo);

        System.out.println("tiene : " + c.cr + " ruedas");
    }
}