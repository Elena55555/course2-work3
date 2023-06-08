public class Bicycle extends Transport implements Checkable {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        this.updateTyre();


    }

    public void updateTyre() {
        System.out.println(" Обслуживаем " + this.getModelName());
        System.out.println("*********************************************************************************** ");
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println(" Меняем покрышку ");

            System.out.println(" ");


        }
    }
}