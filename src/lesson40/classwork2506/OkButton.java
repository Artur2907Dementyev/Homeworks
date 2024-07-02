package lesson40.classwork2506;

public class OkButton implements Button {


    @Override
    public void onClick() {
        System.out.println("Вы нажали на окей");
    }
}
class CancelButton implements Button {

    @Override
    public void onClick() {
        System.out.println("Нажали на кнопку отмены");
    }
}
