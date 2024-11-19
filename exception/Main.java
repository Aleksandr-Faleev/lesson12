//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "Z", "3", "4"},
                {"2", "1", "2", "4"},
                {"3", "2", "1", "4"},
                {"4", "2", "3", "1"},
        };
        try{
            int result = ArrayProcessor.processArray(array);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных массива: " + e.getMessage());
        }
    }
}