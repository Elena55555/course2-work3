public class Truck extends Transport implements Checkable  {
    public Truck (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        this.updateTyre();
        this.checkEngine();
        this.checkTrailer();

    }

    public void updateTyre() {
        System.out.println(" Обслуживаем " + this.getModelName());
        System.out.println("*********************************************************************************** ");
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println(" Меняем покрышку ");


        }

        System.out.println(" ");

    }

    public void checkEngine () {
        System.out.println(" Обслуживаем " + this.getModelName());
        System.out.println("*********************************************************************************** ");
        for (int i = 0; i <  1; i++) {
            System.out.println(" Проверяем двигатель ");


        }

        System.out.println(" ");

    }
    public void checkTrailer () {
        System.out.println(" Обслуживаем " + this.getModelName());
        System.out.println("*********************************************************************************** ");
        for (int i = 0; i < 1; i++) {
            System.out.println(" Проверяем прицеп ");

        }

        System.out.println(" ");
    }
}
